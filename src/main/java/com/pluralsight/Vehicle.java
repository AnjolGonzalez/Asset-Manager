package com.pluralsight;
import java.time.Year;

public class Vehicle extends Asset{

    private String makeModel;
    private int year, odometer;

    public Vehicle(String dateAcquired, String description, double originalCost, String makeModel, int year, int odometer) {

        super(dateAcquired, description, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;

    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    public double value() {

        double yearNow = Year.now().getValue();
        double yearValue = yearNow - year;

        if (yearValue <= 3) {
            double value = originalCost * .7;
            if (!makeModel.contains("Volkswagon") && !makeModel.contains("Jeep") && odometer > 100000) {
                return value * .75;
            }else {
                return value;
            }
        } else if (yearValue > 3 && yearValue <= 6) {
            double value = originalCost * .4;
            if (!makeModel.contains("VolksWagon") && !makeModel.contains("Jeep") && odometer > 100000){
                return value * .75;
            }else {
                return value;
            }
        }
        else if (yearValue > 6 && yearValue <= 10) {
            double value = originalCost * .2;
            if (!makeModel.contains("Volkswagon") && !makeModel.contains("Jeep") && odometer > 100000){
                return value * .75;
            }else {
                return value;
            }
        } else {
            double value = 1000;
            if (!makeModel.contains("Volkswagon") && !makeModel.contains("Jeep") && odometer > 100000){
                return value * .75;
            }else {
                return value;

            }
        }
    }
}
