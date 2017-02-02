package goJava.modul9;

import goJava.modul4.home_work2.Currency;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Vova on 02.02.2017.
 */
//package core.module09.homework;
//
//        import core.module04.homework.Currency;
//
//        import java.util.*;
//        import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(12, "Alex", "Popov", "Kyiv", 25454);
        User user2 = new User(22, "Ivan", "Marchuk", "Dnipro", 387500);
        User user3 = new User(34, "Pavel", "Pavlov", "Kyiv", 787597);
        User user4 = new User(32, "Pavel", "Vernil", "Kiev", 877578);
        User user5 = new User(44, "Kate", "Petrova", "Dnipro", 47867834);
        User user6 = new User(40, "Sveta", "Saimonovna", "Lviv", 7327878);
        User user7 = new User(56, "Katya", "Petrova", "Rivne", 787837);
        User user8 = new User(75, "Olga", "Chaliy", "Lviv", 443278);
        User user9 = new User(60, "Vova", "Stanislavskiy", "Dnipro", 78723);
        User user10 = new User(65, "Sergey", "Aleksndrov", "Kyiv", 284758);

        Currency grn = Currency.UAH;
        Currency usd = Currency.USD;

        Order order1 = new Order(34565, 600, grn, "Nokia", "Rozetka", user1);
        Order order2 = new Order(36437, 1000, usd, "Samsung", "MoYo", user2);
        Order order3 = new Order(67634, 1550, grn, "Samsung ", "Rozetka", user3);
        Order order4 = new Order(73236, 600, usd, "Bicycle", "Rozetka", user4);
        Order order5 = new Order(79856, 1200, grn, "Nokia", "MoYo", user5);
        Order order6 = new Order(47838, 1500, usd, "Samsung", "Rozetka", user6);
        Order order7 = new Order(11873, 900, grn, "Notebook", "Rozetka", user7);
        Order order8 = new Order(68755, 8000, grn, "Notebook", "Comfy", user8);
        Order order9 = new Order(12445, 600, usd, "Notebook", "Comfy", user9);
        Order order10 = new Order(97643, 26000, grn, "Notebook", "Rozetka", user10);

        List<Order> orders = new ArrayList<>();
        Collections.addAll(orders, order1, order2, order3, order4, order5, order6, order7, order8, order9, order10);

        printCollectionAndInfo(orders, "source list:");
//        System.out.println(Arrays.deepToString(orders.toArray()));

        sortByPrice(orders);
        printCollectionAndInfo(orders, "sorted list by price in decrase order");

        sortByPriceAndCity(orders);
        printCollectionAndInfo(orders, "sorted list by price and city");

        sortByItemThenShopThenCity(orders);
        printCollectionAndInfo(orders, "sorted list by itemName and shopIdentificator and city");

        printCollectionAndInfo(getUniqueOrders(orders), "deleted duplicates in list");

        printCollectionAndInfo(getOrdersLess1500(orders), "deleted items with price less then 1500");

        System.out.println(getCurrencyListMap(orders));
        System.out.println();

        System.out.println(getCurrencyListMap(orders));
        System.out.println();

        System.out.println(getCityListMap(orders));
        System.out.println();

        System.out.println("List" +
                (listHasUsersLastName(orders, "Petrov") ? "" : " does not") +
                " contains order (s) with users with last name Petrov");
        System.out.println();
        printCollectionAndInfo(getOrdersWithoutCurrency(orders, Currency.USD), "deleted items with Currency USD");
    }

    public static List<Order> getOrdersWithoutCurrency(List<Order> orders, Currency cur) {
//        orders.removeIf(order -> order.getCurrency().equals(cur));   it's working, but I couldn't decide what method is better.
        return orders.stream().
                filter(order -> !order.getCurrency().equals(cur)).collect(Collectors.toList());
    }

    public static boolean listHasUsersLastName(List<Order> orders, String petrov) {
        return orders.stream().anyMatch(order -> order.getUser().getLastName().equals(petrov));
    }

    public static Map<String, List<Order>> getCityListMap(List<Order> orders) {
        return orders.stream().collect(Collectors.groupingBy(o -> o.getUser().getCity()));
    }

    public static Map<Currency, List<Order>> getCurrencyListMap(List<Order> orders) {
        return orders.stream().collect(Collectors.groupingBy(Order::getCurrency));
    }

    public static List<Order> getOrdersLess1500(List<Order> ordersUnique) {
        return ordersUnique.stream().
                filter(order -> order.getPrice() < 1500).collect(Collectors.toList());
    }


    public static List<Order> getUniqueOrders(List<Order> orders) {
        return orders.stream().distinct().collect(Collectors.toList());
    }

    public static void sortByItemThenShopThenCity(List<Order> orders) {
        orders.sort(Comparator.comparing(Order::getItemName).
                thenComparing(Order::getShopIdentificator).
                thenComparing(o -> o.getUser().getCity()));
    }

    public static void sortByPriceAndCity(List<Order> orders) {
        orders.sort(Comparator.comparing(Order::getPrice).
                thenComparing(o -> o.getUser().getCity()));
    }

    public static void sortByPrice(List<Order> orders) {
        orders.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
    }

    public static void printCollectionAndInfo(Collection<Order> orders, String infoText) {
        System.out.println("---------------------------" + infoText + "---------------------------");
        orders.forEach(System.out::print);
        System.out.println();
    }
}
