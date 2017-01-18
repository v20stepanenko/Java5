package goJava.modul8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vova on 18.01.2017.
 */
public class AbstractDAOImpl<T> implements AbstractDAO<T> {

    List<T> list = new ArrayList<>();

    @Override
    public void save(T t) {
        list.add(t);
    }

    @Override
    public void delete(T t) {
        list.remove(t);
    }

    @Override
    public void deleteAll(List T) {
        list.removeAll(T);
    }

    @Override
    public void saveAll(List T) {
        list.addAll(T);
    }

    @Override
    public List<T> getList() {
        return list;
    }

    @Override
    public void deleteById(long id) {
        list.remove(id);
    }

    @Override
    public T get(long id) {
        return list.get((int) id);
    }
}