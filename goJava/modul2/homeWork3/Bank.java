package goJava.modul2.homeWork3;import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * int[] balances = {1200, 250, 2000, 500, 3200};
 * String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 */
public class Bank {
    static HashMap<String, Double> spisok = new HashMap<>();
    static double withdrawal;

    public static void main(String[] args) throws IOException {

        spisok.put("Jane", (double) 1200);
        spisok.put("Ann", (double) 250);
        spisok.put("Jack", (double) 2000);
        spisok.put("Oww", (double) 500);
        spisok.put("Lane", (double) 3200);
        System.out.println("Ведите имя на латынице");
        for (Map.Entry<String, Double> entry : spisok.entrySet()) {
            System.out.printf("%s - balance %.2f\n", entry.getKey(), entry.getValue());
        }


        egegey:
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            if (spisok.containsKey(name)) {
                System.out.println("сколько денег снять?");

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

                double comision = withdrawal * 0.05;

                double balance = spisok.get(name) - withdrawal - comision;

                if (balance > 0) {

                    spisok.put(name, balance);
                    System.out.printf("%s withdrawal  =  %.2f, balance  =  %.2f", name, withdrawal, spisok.get(name));
                    break;

                } else System.out.println("No");

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
