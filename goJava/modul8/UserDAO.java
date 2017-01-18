package goJava.modul8;

import java.util.List;

/**
 * Created by Vova on 18.01.2017.
 */
public class UserDAO<T> extends  AbstractDAOImpl<T> {

    private long id;
    private String name;

    public UserDAO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void save(T o) {
        super.save(o);
    }

    @Override
    public void saveAll(List T) {
        super.saveAll(T);
    }

    @Override
    public void deleteById(long id) {
        list.remove(this.getId());
    }

    public long getId() {
        return id;
    }

}
