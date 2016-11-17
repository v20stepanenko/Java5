package goJava.modul4.homeWork3and4;

import goJava.modul4.homeWork1.Bank;
import goJava.modul4.homeWork2.Currency;

/**
 * EUBank: лимит снятия = 2000, если валюта - USD и 2200, если EUR
 лимит пополнения - 20000, если EUR и 10000, если USD
 месячная ставка - 0% на USD и 1% на EUR
 комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 2%, если EUR и до 1000 и 4%, если EUR и больше 1000
 *
 * Created by Vova on 16.11.2016.
 */
public class EUBank extends Bank {

    @Override
    public int getLimitOfWithdrawal() {
        int limit = 2000;
        if (this.getCurrency() == Currency.EUR) {
            limit = 2200;
        }
        return limit;
    }

    @Override
    public int getLimitOfFunding() {
        int limit = 10000;
        if (this.getCurrency() == Currency.EUR) {
            limit = 20000;
        }
        return limit;
    }

    @Override
    public int getMonthlyRate() {
        int rate = 0;
        if (this.getCurrency() == Currency.EUR) {
            rate = 1;
        }
        return rate;

    }

    @Override
    public int getCommission(int summ) {
        int commision = 5;
        if (this.getCurrency() == Currency.USD && summ > 1000) {
            commision = 7;
        }
        if (this.getCurrency() == Currency.EUR) {
            if (summ <= 1000) {
                commision = 2;
            } else commision = 4;
        }
        return commision;
    }

}
