package goJava.modul5;

import java.util.Date;

/**
 * Created by Admin on 27.11.2016.
 */
public class BookingComAPI extends AbstractAPI {
    Room[] bookingRooms;

    public BookingComAPI() {
        bookingRooms = new Room[5];
        bookingRooms[0] = new Room(10, 200, 2, new Date(), "Hilton", "Kiev");
        bookingRooms[1] = new Room(11, 300, 3, new Date(), "Marcus Marriott", "New York");
        bookingRooms[2] = new Room(12, 500, 2, new Date(), "Caesars Palace", "LasVegas");
        bookingRooms[3] = new Room(13, 600, 1, new Date(), "Hotel Vienna", "Vienna");
        bookingRooms[4] = new Room(19, 9000, 2, new Date(), "Rosa Grand", "Milan");
    }

    @Override
    public Room[] getRooms() {
        return bookingRooms;
    }
}