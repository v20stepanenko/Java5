package goJava.modul7;

import java.util.Comparator;

/**
 * Created by Admin on 04.01.2017.
 */
public class PriceComporator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
