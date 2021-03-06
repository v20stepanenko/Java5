package goJava.modul7;

import java.util.Comparator;

/**
 * Created by Admin on 04.01.2017.
 */
public class ItemIndificatorCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if(o1.getItemName().compareTo(o2.getItemName())==0 && o1.getShopIdentificator().compareTo(o2.getShopIdentificator())==0){
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }
        if (o1.getItemName().compareTo(o2.getItemName())==0){
            return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
        }
        else return o1.getItemName().compareTo(o2.getItemName());
    }
}

