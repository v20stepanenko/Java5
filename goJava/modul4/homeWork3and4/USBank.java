package goJava.modul4.homeWork3and4;

import goJava.modul4.homeWork1.Bank;
import goJava.modul4.homeWork2.Currency;


/**
 * USBank: лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
 * лимит пополнения - 10000, если EUR, и нет лимита, если USD
 * месячная ставка - 1% на USD и 2% на EUR
 * комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 * 6%, если EUR и до 1000 и 8%, если EUR и больше 1000
 * Created by Vova on 16.11.2016.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }


    @Override
    public int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD) return 1000;
        else return 1200;
    }

    @Override
    public int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) return 10000;
        else return 0;
    }

    @Override
    public int getMonthlyRate() {
        if (this.getCurrency() == Currency.EUR) return 2;
        else return 1;
    }

    @Override
    public int getCommission(int summ) {
        if (this.getCurrency() == Currency.USD) {
            if (summ < 1000) return 5;
            else return 7;
        } else {
            if (summ < 1000) return 6;
            else return 8;
        }

    }
}
