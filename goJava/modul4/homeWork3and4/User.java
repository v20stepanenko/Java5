package goJava.modul4.homeWork3and4;

import goJava.modul4.homeWork1.Bank;
import goJava.modul4.homeWork2.Currency;

/**
 * Created by Vova on 16.11.2016.
 */
public class User {
    public long id;
    public String name;
    public double balance;
    public int monthsOfEmployment;
    public String companyName;
    public int salary;
    public Bank bank;

    @Override
    public String toString() {
        return super.toString();
    }

    void demonstrationHW3() {
        Bank bankEU = new EUBank();
        User nameVova = new User();
        nameVova.name = "Vova";
        nameVova.bank = bankEU;
        nameVova.bank.setCurrency(Currency.EUR);
        System.out.println(nameVova.bank.getLimitOfWithdrawal());
    }

}
