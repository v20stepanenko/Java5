//package goJava.modul2.homeWork3;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * int[] balances = {1200, 250, 2000, 500, 3200};
// * String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
// */
//public class Bank {
//
//    static double withdrawal;
//
//    static public boolean isValid(String input) {
//        int count = 0;
//
//        if (input.isEmpty()) return false;
//
//        for (char ch : input.toCharArray()) {
//            if (ch == '.') ++count;
//            if (count > 1) return false;
//            if (!Character.isDigit(ch) && ch != '.') {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        double[] balances = {1200, 250, 2000, 500, 3200};
//        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
//
//        System.out.println("Ведите имя на латынице");
//        for (int i = 0; i < ownerNames.length; i++) {
//            System.out.printf("%s - balance %.2f\n", ownerNames[i], balances[i]);
//        }
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String name = reader.readLine();
//        if (validNames(name, ownerNames)) {
//            System.out.println("сколько денег снять?");
//            withdrawal=
//
//        }
//
//    }
//
//    static boolean validNames(String name, String[] ownerNames) {
//        for (int i = 0; i < ownerNames.length; i++) {
//            if (ownerNames[i].equals(name)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    int indexOwner(String name, String[] ownerNames) {
//        int index = 0;
//        for (int i = 0; i < ownerNames.length; i++) {
//            if (ownerNames[i].equals(name)) {
//                index = i;
//                break;
//            }
//        }
//        return index;
//    }
//}
//
//
////
////        egegey:
////        while (true) {
////            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
////            String name = reader.readLine();
////            boolean ok = false;
////            int index = 0;
////            for (int i = 0; i < ownerNames.length; i++) {
////                if (ownerNames[i].equals(name)) {
////                    ok = true;
////                    index = i;
////                    break;
////                }
////            }
////
////
////            if (ok) {
////                System.out.println("сколько денег снять?");
////
////
////                while (true) {
////                    String input;
////                    System.out.println("Введите число");
////                    input = reader.readLine();
////                    if (isValid(input)) {
////                        withdrawal = Double.parseDouble(input);
////                        break;
////                    }
////                }
////
////                double comision = withdrawal * 0.05;
////
////                double balance = balances[index] - withdrawal - comision;
////
////                if (balance > 0) {
////
////                    balances[index] = balance;
////                    System.out.printf("%s withdrawal  =  %.2f, balance  =  %.2f", name, withdrawal, balances[index]);
////                    break;
////
////                } else System.out.println("No");
////
////            } else {
////                System.out.printf("Такого имени нету в даной базе\n \"Y\" или \"y\" для повторного воода\n");
////                if (reader.readLine().toLowerCase().equals("y")) {
////
////                    System.out.println("Вводите");
////                    continue egegey;
////                } else {
////                    System.out.println("Программа остановлена");
////                    break;
////                }
////            }
////        }
////    }
////}
