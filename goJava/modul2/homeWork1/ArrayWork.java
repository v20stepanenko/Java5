package goJava.modul2.homeWork1;

/**
 * Created by Vova on 26.10.2016.
 */

public class ArrayWork {

    public static void main(String[] args) {
//        Выделяем память под масивы
        int[] integer = new int[10];
        double[] doubleV = new double[10];
        //Заполняем масивы
        for (int i = 0; i < integer.length; i++) {
            integer[i] = ((int) (Math.random() * 1000) - 300);
        }
        for (int i = 0; i < doubleV.length; i++) {
            doubleV[i] = ((Math.random() * 1000) - 300);
        }
// * sum(int array[]), sum(double[])
// * min(int array[]), min(double[])
// * max(int array[]), max(double[])
// * maxPositive(int array[]), maxPositive(double array[]),
// * multiplication  (int array[]), multiplication (double[])
// * modulus(int array[]), modulus(double[])
// * secondLargest(int array[]), secondLargest(double[])

        ArrDouble bobl = new ArrDouble();
        System.out.printf("Dlya double \n sum = %f \n min = %f\n max = %f\n max positive = %s\n multiplication = %f\n modulus = %f\n second largest =%f",
                bobl.sum(doubleV),
                bobl.min(doubleV),
                bobl.max(doubleV),
                bobl.maxPositive(doubleV),
                bobl.multiplication(doubleV),
                bobl.modulus(doubleV),
                bobl.secondLargest(doubleV));


        ArrInt integger = new ArrInt();
        System.out.printf("\n=================================\n Dlya intov  \n sum = %d \n min = %d\n max = %d\n max positive = %s\n multiplication = %d\n modulus = %d\n second largest =%d",
                integger.sum(integer),
                integger.min(integer),
                integger.max(integer),
                integger.maxPositive(integer),
                integger.multiplication(integer),
                integger.modulus(integer),
                integger.secondLargest(integer));



    }
}




