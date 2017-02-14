package goJava.modul8;

import java.util.List;
import java.util.Optional;

/**
 * Created by Vova on 18.01.2017.
 */
public class UserDAO extends  AbstractDAOImpl<User> {

    @Override
    public void save(User user) {
        super.save(user);
    }

    @Override
    public void saveAll(List<User> users) {
        super.saveAll(users);
    }

    @Override
    public void deleteById(long id) {
       getList().removeIf(user -> user.getId() == id);
    }

    @Override
    public User get(long id) {
        for (User user : getList()) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

}
