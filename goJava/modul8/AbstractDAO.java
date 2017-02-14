package goJava.modul8;

import java.util.List;

/**
 * Created by Vova on 18.01.2017.
 */
public interface AbstractDAO<T>{

    void save (T t);
    void delete(T t);
    void deleteAll(List<T> t);
    void saveAll(List<T> t);
    List<T> getList();
    void deleteById(long id);
    T get(long id);

}
