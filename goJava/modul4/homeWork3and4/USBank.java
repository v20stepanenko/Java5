package goJava.modul4.homeWork3and4;

import goJava.modul4.homeWork1.Bank;
import goJava.modul4.homeWork2.Currency;


/**
 * USBank: лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
 лимит пополнения - 10000, если EUR, и нет лимита, если USD
 месячная ставка - 1% на USD и 2% на EUR
 комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 6%, если EUR и до 1000 и 8%, если EUR и больше 1000
 * Created by Vova on 16.11.2016.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital){
        super( id,  bankCountry,  currency,  numberOfEmployees,  avrSalaryOfEmployee,  rating, totalCapital);
    }


    @Override
    public int getLimitOfWithdrawal() {
        int limit = 1000;
        if (this.getCurrency() == Currency.EUR) {
            limit = 1200;
        }
        return limit;
    }

    @Override
    public int getLimitOfFunding() {
        int limit = Integer.MAX_VALUE;
        if (this.getCurrency() == Currency.EUR) {
            limit = 10000;
        }
        return limit;
    }

    @Override
    public int getMonthlyRate() {
        int rate = 1;
        if (this.getCurrency() == Currency.EUR) {
            rate = 2;
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
                commision = 6;
            } else commision = 8;
        }
        return commision;
    }

}
