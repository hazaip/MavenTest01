package framework;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

@Singleton
@Startup
public class DatabaseInitStartup {

    @EJB
    private UserDao userDao;

    @EJB
    private BabyDao babyDao;

    @EJB
    private WeightDataDao weightDataDao;

    @PostConstruct
    public void init() {
//        userDao.addUser(new User("admin", "Adminisztrátor", "test", "admin"));
//        userDao.addUser(new User("peet", "Hazai Péter", "test", "user"));
//        babyDao.addBaby(new Baby("Marci", EGender.BOY, userDao.getUser("peet")));
//        Random r = new Random();
//        Date startDate = new GregorianCalendar(2017, Calendar.APRIL, 1).getTime();
//        Date lastDate = startDate;
//        Baby Marci = babyDao.getBaby("1");
//        for (int i = 0; i < 200; i++) {
//            Date offsetDate = new GregorianCalendar(0, 0, 0, r.nextInt(24), r.nextInt(60), r.nextInt(60)).getTime();
//            Date date = new Date(lastDate.getTime() + r.nextInt(1000 * 60 * 60 * 24));
//            lastDate = new Date(date.getTime());
//            weightDataDao.setWeightData(new WeightData(Marci, date, 5700 + i * r.nextInt(35)));

//        }



    }

}