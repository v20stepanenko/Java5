package goJava.modul2.home_work1;

/**
 * Created by Admin on 03.11.2016.
 */
public class ArrInt {

    int sum(int[] intg) {
        int sum = intg[0];
        for (int i = 1; i < intg.length; i++) {
            sum += intg[i];
        }
        return sum;
    }

    int min(int[] intg) {
        int min = intg[0];
        for (int i = 1; i < intg.length; i++) {

            if (min > intg[i]) {
                min = intg[i];
            }
        }

        return min;
    }

    int max(int [] intg) {
        int max = intg[0];
        for (int i = 1; i < intg.length; i++) {

            if (max < intg[i]) {
                max = intg[i];
            }
        }

        return max;
    }

    String maxPositive(int[] intg) {
        String ok;
        double max = max(intg);
        if (max(intg) > 0) {
            ok =Double.toString(max)  ;
        }
        else ok = "false";
        return ok;
    }



    int multiplication(int[] intg) {
        int multiplication = intg[0];
        for (int i = 1; i < intg.length; i++) {

            multiplication *= intg[i];

        }
        return multiplication;
    }

    int modulus(int[] intg) {

        int modulus = intg[0] % intg[intg.length - 1];
        return modulus;

    }

    int secondLargest(int[] intg) {
        int secondLargest = intg[0];
        int max = intg[0];

        for (int i = 1; i < intg.length; i++) {

            if (secondLargest < intg[i]) {
                if (max < intg[i]) {
                    max = intg[i];
                } else {
                    secondLargest = intg[i];
                }
            }
        }

        return secondLargest;
    }

}

