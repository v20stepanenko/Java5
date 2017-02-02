package goJava.modul2.home_work1;

/**
 * Created by Admin on 03.11.2016.
 */
public class ArrDouble {

    double sum(double[] dobl) {
        double sum = dobl[0];
        for (int i = 1; i < dobl.length; i++) {
            sum += dobl[i];
        }
        return sum;
    }

    double min(double[] dobl) {
        double min = dobl[0];
        for (int i = 1; i < dobl.length; i++) {

            if (min > dobl[i]) {
                min = dobl[i];
            }
        }

        return min;
    }

    double max(double[] dobl) {
        double max = dobl[0];
        for (int i = 1; i < dobl.length; i++) {

            if (max < dobl[i]) {
                max = dobl[i];
            }
        }

        return max;
    }

    String maxPositive(double[] dobl) {
        String ok;
        double max = max(dobl);
        if (max(dobl) > 0) {
            ok = Double.toString(max);
        } else ok = "false";
        return ok;
    }


    double multiplication(double[] dobl) {
        double multiplication = dobl[0];
        for (int i = 1; i < dobl.length; i++) {

            multiplication *= dobl[i];

        }
        return multiplication;
    }

    double modulus(double[] dobl) {

        double modulus = dobl[0] % dobl[dobl.length - 1];
        return modulus;

    }

    double secondLargest(double[] dobl) {
        double secondLargest = dobl[0];
        double max = dobl[0];

        for (int i = 1; i < dobl.length; i++) {

            if (secondLargest < dobl[i]) {
                if (max < dobl[i]) {
                    max = dobl[i];
                } else {
                    secondLargest = dobl[i];
                }
            }
        }

        return secondLargest;
    }

}

