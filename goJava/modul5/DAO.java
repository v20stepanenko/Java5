package goJava.modul5;

/**
 * Created by Admin on 27.11.2016.
 */
public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);

}