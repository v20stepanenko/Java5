package goJava.modul10;

import goJava.modul10.my_exception.ExceptionA;
import goJava.modul10.my_exception.ExceptionB;
import goJava.modul10.my_exception.ExceptionC;
import goJava.modul10.my_exception.ModException;

import java.util.Random;

/**
 * Created by Vova on 08.02.2017.
 */
public class FifthTask {

    public static void main(String[] args) {
        try {
            Random randomNumber = new Random();
            switch (randomNumber.nextInt(3)) {
                case 0:
                    throwException(ModException.EXCEPTION_A);
                case 1:
                    throwException(ModException.EXCEPTION_B);
                case 2:
                    throwException(ModException.EXCEPTION_C);
            }
        } catch (ExceptionA | ExceptionB | ExceptionC e) {
            System.out.println(e.getMessage());
        }
    }

    public static void throwException(ModException mod) throws ExceptionA, ExceptionB, ExceptionC {  //ModException it's enum
        switch (mod) {
            case EXCEPTION_A:
                throw new ExceptionA();
            case EXCEPTION_B:
                throw new ExceptionB();
            case EXCEPTION_C:
                throw new ExceptionC();
        }
    }
}
