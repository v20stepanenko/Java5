package goJava.modul4.home_work3and4;

import goJava.modul4.home_work1.Bank;
import goJava.modul4.home_work2.Currency;

/**
 * EUBank: лимит снятия = 2000, если валюта - USD и 2200, если EUR
 * лимит пополнения - 20000, если EUR и 10000, если USD
 * месячная ставка - 0% на USD и 1% на EUR
 * комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 * 2%, если EUR и до 1000 и 4%, если EUR и больше 1000
 * <p>
 * Created by Vova on 16.11.2016.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD) return 2000;
        else return 2200;
    }

    @Override
    public int getLimitOfFunding() {
        if (this.getCurrency() == Currency.EUR) return 20000;
        else return 10000;
    }

    @Override
    public int getMonthlyRate() {
        if (this.getCurrency() == Currency.USD) return 0;
        else return 1;
    }

    @Override
    public int getCommission(int amount) {
        if (this.getCurrency() == Currency.USD) {
            if (amount < 1000) return 5;
            else return 7;
        } else {
            if (amount < 1000) return 2;
            else return 4;
        }
    }

}
