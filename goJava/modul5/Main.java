package goJava.modul5;

import java.util.Date;

/**
 * Created by Admin on 27.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        long start = System.nanoTime();

        Controller controller = new Controller();
        controller.requstRooms(200,2,"Kiev","Hilton");
        controller.requstRooms(300,1,"LasVegas","Luxor");
        for(Room r : controller.requstRooms(200,2,"Kiev","Hilton")){
            System.out.println(r.getId());
        }

        API api1 = new BookingComAPI();
        API api2 = new GoogleAPI();
        controller.check(api1,api2);

        Room r1 = new Room(1, 222, 2, new Date(), "hotel", "city");
        DAO dao = new DAOimpl();
        dao.save(r1);
        dao.delete(r1);

        long end = System.nanoTime();
        long traceTime = end-start;

        System.out.println(traceTime);

    }
}

