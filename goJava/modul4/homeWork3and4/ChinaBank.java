package goJava.modul4.homeWork3and4;

import goJava.modul4.homeWork1.Bank;
import goJava.modul4.homeWork2.Currency;

/**
 * ChinaBank: лимит снятия = 100, если валюта - USD и 150, если EUR
 лимит пополнения - 5000, если EUR и 10000, если USD
 месячная ставка - 1% на USD и 0% на EUR
 комиссия 3%, если USD и до 1000, 5%, если USD и больше 1000
 10%, если EUR и до 1000 и 11%, если EUR и больше 1000
 * Created by Vova on 16.11.2016.
 */
public class ChinaBank extends Bank{

    @Override
    public int getLimitOfWithdrawal() {
        int limit = 100;
        if (this.getCurrency() == Currency.EUR) {
            limit = 150;
        }
        return limit;
    }

    @Override
    public int getLimitOfFunding() {
        int limit = 10000;
        if (this.getCurrency() == Currency.EUR) {
            limit = 5000;
        }
        return limit;
    }

    @Override
    public int getMonthlyRate() {
        int rate = 1;
        if (this.getCurrency() == Currency.EUR) {
            rate = 0;
        }
        return rate;

    }

    @Override
    public int getCommission(int summ) {
        int commision = 3;
        if (this.getCurrency() == Currency.USD && summ > 1000) {
            commision = 5;
        }
        if (this.getCurrency() == Currency.EUR) {
            if (summ <= 1000) {
                commision = 10;
            } else commision = 11;
        }
        return commision;
    }

}
