package goJava.modul5;

import java.util.Date;

/**
 * Created by Admin on 27.11.2016.
 */
public abstract class AbstractAPI implements API {

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        Room [] res={new Room(0, 0, 0, new Date(), "не найдено", "не найдено")};
        Room [] temp = new Room[getRooms().length];
        for (Room r : getRooms()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName()==hotel){
                temp[count]=r;
                count++;
            }
        }
        if(temp[0]!=null){
            res = new Room[count];
            for(int i=0; i<res.length;i++){
                res[i]=temp[i];
            }
        }
        return res;
    }
}