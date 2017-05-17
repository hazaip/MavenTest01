package framework;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.Date;
import java.util.List;

@Stateless
public class WeightDataService {

    @EJB
    private WeightDataDao weightDataDao;

    @EJB
    private BabyDao babyDao;

    public void setWeightData(String babyId, Date date, int weight) {
        Baby baby = babyDao.getBaby(babyId);
        weightDataDao.setWeightData(new WeightData(baby, date, weight));
    }

    public List<WeightData> getWeightData(String babyId) {
        return weightDataDao.getWeightData(babyId);
    }


}
