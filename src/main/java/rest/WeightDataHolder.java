package rest;

import framework.WeightData;

/**
 * Created by Peet on 2017. 05. 17..
 */
public class WeightDataHolder {

    long date;
    int weight;

    public WeightDataHolder() {
    }

    public WeightDataHolder(long date, int weight) {
        this.date = date;
        this.weight = weight;
    }

    public WeightDataHolder(WeightData weightData) {
        this.date = weightData.getDate().getTime();
        this.weight = weightData.getWeight();
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
