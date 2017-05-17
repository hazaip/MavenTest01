package framework;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class UserDao {

    @PersistenceContext(unitName = "babynetDbPU")
    private EntityManager em;

    public void modifyUser(String username, String name, String password, String userGroup) {
        User user = em.find(User.class, username);
        user.setName(name);
        user.setPassword(password);
        user.setUserGroup(userGroup);
    }

    public List<User> getUsers() {
        TypedQuery<User> users = em.createQuery("SELECT u FROM User u", User.class);
        return new ArrayList<User>(users.getResultList());
    }

    public User getUser(String username) {
        return em.find(User.class, username);
    }

    public void addUser(User user) {
        save(user);
    }

    private void save(Object entity) {
        em.persist(entity);
    }
}
