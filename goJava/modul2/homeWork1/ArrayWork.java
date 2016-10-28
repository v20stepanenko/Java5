package goJava.modul2.homeWork1;

/**
 * Created by Vova on 26.10.2016.
 */

public class ArrayWork {

    public static void main(String[] args) {

        int[] integer = new int[10];
        double[] doubleV = new double[10];


        for (int i = 0; i < integer.length; i++) {

            integer[i] = ((int) (Math.random() * 1000) - 300);

        }
        for (int i = 0; i < doubleV.length; i++) {

            doubleV[i] = ((Math.random() * 1000) - 300);

        }
        arrMethod(integer);
        arrDoubleMethod(doubleV);
    }

    public static void arrMethod(int[] ints) {

        int modulus = ints[0] % ints[ints.length - 1];
        int sum = ints[0];
        int max = ints[0];
        int min = ints[0];
        long multiplication = ints[0];
        int secondLargest = ints[0];

        for (int i = 1; i < ints.length; i++) {

            multiplication *= ints[i];
            sum += ints[i];
            if (secondLargest < ints[i]) {
                if (max < ints[i]) {
                    max = ints[i];
                } else {
                    secondLargest = ints[i];
                }
            }
            if (min > ints[i]) {
                min = ints[i];
            }
        }
        System.out.printf("Sum = %d \n Max = %d \n Min = %d \n Multiplication = %d \n Second largest = %d \n Modulus = %d \n", sum, max, min, multiplication, secondLargest, modulus);
        if (max >= 0) System.out.printf("Max positive = %d\n", max);

    }

    public static void arrDoubleMethod(double[] dobl) {

        double modulus = dobl[0] % dobl[dobl.length - 1];
        double sum = dobl[0];
        double max = dobl[0];
        double min = dobl[0];
        double multiplication = dobl[0];
        double secondLargest = dobl[0];

        for (int i = 1; i < dobl.length; i++) {

            multiplication *= dobl[i];
            sum += dobl[i];

            if (secondLargest < dobl[i]) {
                if (max < dobl[i]) {
                    max = dobl[i];
                } else {
                    secondLargest = dobl[i];
                }
            }

            if (min > dobl[i]) {
                min = dobl[i];
            }
        }
        System.out.printf("Sum = %f \n Max = %f \n Min = %f \n Multiplication = %f \n Second largest = %f \n Modulus = %f \n", sum, max, min, multiplication, secondLargest, modulus);
        if (max >= 0) System.out.printf("Max positive = %f", max);

    }
}




