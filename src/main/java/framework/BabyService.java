package framework;


import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class BabyService {

    @EJB
    private BabyDao babyDao;

    public void addBaby(String name, EGender gender, User parent) {
        babyDao.addBaby(new Baby(name, gender, parent));
    }

    public List<Baby> getBabies(String parent) {
        return babyDao.getBabies(parent);
    }

    public Baby getBaby(String id) {
        return babyDao.getBaby(id);
    }
}
