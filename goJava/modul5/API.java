package goJava.modul5;

/**
 * Created by Admin on 27.11.2016.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getRooms();
}
