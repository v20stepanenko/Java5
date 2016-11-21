package goJava.modul4.homeWork5;

import goJava.modul4.homeWork3and4.User;

/**
 * Created by Vova on 21.11.2016.
 */
public class BankSystemImpl implements  BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        user.balance-=amount;
    }

    @Override
    public void fundUser(User user, int amount) {
        user.balance += amount;
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        fromUser.balance -=amount;
        toUser.balance +=amount;
    }

    @Override
    public void paySalary(User user) {
        user.balance+=user.salary;
    }
}
