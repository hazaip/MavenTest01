package framework;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "weighData")
public class WeightData {

    @Id
    @GeneratedValue
    String id;
    @ManyToOne
    Baby baby;
    Date date;
    int weight;

    public WeightData() {
    }

    public WeightData(Baby baby, Date date, int weight) {
        this.baby = baby;
        this.date = date;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
