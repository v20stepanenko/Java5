package goJava.modul4.homeWork5;

import goJava.modul4.homeWork3and4.ChinaBank;
import goJava.modul4.homeWork3and4.EUBank;
import goJava.modul4.homeWork3and4.USBank;
import goJava.modul4.homeWork3and4.User;

/**
 * Created by Vova on 17.11.2016.
 */
public class Main {

    public static void main(String[] args) {

        User nameJhon = new User();
        nameJhon.name = "Jhon";
        nameJhon.bank = new USBank();

        User nameJordan = new User();
        nameJordan.name = "Jordan";
        nameJordan.bank = new USBank();
        User nameJenny = new User();
        nameJenny.name = "Jenny";
        nameJenny.bank = new EUBank();
        User nameJeky = new User();
        nameJeky.name = "Jeky";
        nameJeky.bank = new EUBank();
        User nameKi = new User();
        nameKi.name = "Ki";
        nameKi.bank = new ChinaBank();
        User nameLi = new User();
        nameLi.name = "Li";
        nameLi.bank = new ChinaBank();

    }
}
