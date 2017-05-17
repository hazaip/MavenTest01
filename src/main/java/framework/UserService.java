package framework;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class UserService {

    @EJB
    private UserDao userDao;

    public void addUser(String username, String name, String password, String userGroup) {
        userDao.addUser(new User(username, name, password, userGroup));
    }

}