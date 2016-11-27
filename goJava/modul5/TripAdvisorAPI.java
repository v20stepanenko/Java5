package goJava.modul5;

import java.util.Date;

/**
 * Created by Admin on 27.11.2016.
 */
public class TripAdvisorAPI extends AbstractAPI {

    Room[] tripRooms;

    public TripAdvisorAPI() {
        tripRooms = new Room[5];
        tripRooms[0] = new Room(10, 200, 2, new Date(), "Hotel", "City");
        tripRooms[1] = new Room(11, 300, 3, new Date(), "Hotel", "City");
        tripRooms[2] = new Room(12, 500, 2, new Date(), "Hotel", "City");
        tripRooms[3] = new Room(13, 600, 1, new Date(), "Hotel", "City");
        tripRooms[4] = new Room(19, 9000, 2, new Date(),"Hotel", "City");
    }

    @Override
    public Room[] getRooms() {
        return tripRooms;
    }
}