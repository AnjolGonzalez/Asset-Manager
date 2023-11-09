package com.pluralsight;

public class House extends Asset{

    private  String address;
    private int condition, squareFoot, lotSize;


    public House(String dateAcquired, String description, double originalCost, String address, int condition, int squareFoot, int lotSize) {

        super(dateAcquired, description, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {

        if (value() >= 180) {
            System.out.println("1- Excellent");
        } else if (value() > 90 && value() <= 130) {
            System.out.println("2- Good");
        } else if (value() > 80 && value() <= 90) {
            System.out.println("3- Fair");
        } else {
            System.out.println("4- Poor");
        }
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    public double value() {

        switch (condition) {
            case 1:
                value = (180 * squareFoot) + .25 * lotSize;
                break;
            case 2:
                value = (130 * squareFoot) + .25 * lotSize;
                break;
            case 3:
                value = (90 * squareFoot) + .25 * lotSize;
                break;
            case 4:
                value = (80 * squareFoot) + .25 * lotSize;
                break;
        }
        return value;
    }
}
