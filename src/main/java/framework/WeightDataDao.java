package framework;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Stateless
public class WeightDataDao {

    @PersistenceContext(unitName = "babynetDbPU")
    private EntityManager em;

    public void modifyWeightData(String id, Date date, Baby baby, int weight) {
        WeightData weightData = em.find(WeightData.class, id);
        weightData.setDate(date);
        weightData.setBaby(baby);
        weightData.setWeight(weight);
    }

    public List<WeightData> getWeightData(String id) {
        TypedQuery<WeightData> weights = em.createQuery("SELECT wd FROM WeightData wd WHERE wd.baby.id = :id ORDER BY wd.date ASC", WeightData.class);
        weights.setParameter("id", id);
        return new ArrayList<WeightData>(weights.getResultList());
    }

    public void setWeightData(WeightData weightData) { save(weightData); }

    private void save(Object entity) {
        em.persist(entity);
    }
}
