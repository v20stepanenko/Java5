package goJava.modul4.homeWork5;

import goJava.modul4.homeWork3and4.User;

/**
 * Created by Vova on 17.11.2016.
 */
public interface BankSystem {

    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);

}
