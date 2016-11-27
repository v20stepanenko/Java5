package goJava.modul5;

import java.util.Date;

/**
 * Created by Admin on 27.11.2016.
 */
public class Controller {

    API[] apis = {new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};

    Room[] requstRooms(int price, int persons, String city, String hotel) {

        Room[] r = {};

        for (API a : apis) {
            Room[] temp1 = a.findRooms(price, persons, city, hotel);
            if (temp1[0] != null) {
                Room[] temp2 = r;
                r = new Room[temp1.length + temp2.length];
                int i1 = 0;
                int i2 = 0;
                int maxLength = temp1.length < temp2.length ? temp2.length : temp1.length;
                for (int i = 0; i < maxLength; i++) {

                    if (i1 < temp2.length) {
                        r[i1] = temp2[i1];
                        i1++;
                    }
                    if (i2 < temp1.length) {
                        r[temp2.length + i2] = temp1[i2];
                        i2++;

                    }
                }
            }
        }
        return r;
    }

    Room[] check(API api1, API api2) {
        int maxLengthAPI = api1.getRooms().length < api2.getRooms().length ? api1.getRooms().length : api2.getRooms().length;
        Room[] r = new Room[maxLengthAPI];
        int count = 0;
        for (int i = 0; i < api1.getRooms().length ; i++) {
            for (int j = 0; j < api1.getRooms().length; j++) {
                if(api1.getRooms()[i].equals(api2.getRooms()[j])){
                    r[count] = api2.getRooms()[j] ;
                    count++;
                }
            }
        }
        Room roomReturn [] = new Room[count];

        for(int i=0; i<roomReturn.length; i++ ){

            roomReturn[i] = r[i];

        }
        return roomReturn;
    }
}
