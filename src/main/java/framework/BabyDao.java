package framework;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class BabyDao {

    @PersistenceContext(unitName = "babynetDbPU")
    private EntityManager em;

    public void modifyBaby(String id, String name, User parent, EGender gender) {
        Baby baby = em.find(Baby.class, id);
        baby.setName(name);
        baby.setParent(parent);
        baby.setGender(gender);
    }

    public List<Baby> getBabies() {
        TypedQuery<Baby> babies = em.createQuery("SELECT b FROM Baby b", Baby.class);
        return new ArrayList<Baby>(babies.getResultList());
    }

    public List<Baby> getBabies(String parent) {
        TypedQuery<Baby> babies = em.createQuery("SELECT b FROM Baby b WHERE b.parent.username = :parent", Baby.class);
        babies.setParameter("parent", parent);
//        List<Baby> babies = new ArrayList<Baby>(getBabies());
//        List<Baby> result = new ArrayList<Baby>();
//        for (Baby b : babies) {
//            if (b.getParent().equals(parent)) {
//                result.add(b);
//            }
//        }
//        return result;
        return new ArrayList<Baby>(babies.getResultList());
    }

    public Baby getBaby(String id) {
        return em.find(Baby.class, id);
    }

    public void addBaby(Baby baby) {
        save(baby);
    }

    private void save(Object entity) {
        em.persist(entity);
    }

}
