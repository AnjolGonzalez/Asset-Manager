package com.pluralsight;

public class Asset {
    protected String dateAcquired;
    protected String description;
    protected double originalCost;
    protected double value;

    public Asset(String dateAcquired, String description, double originalCost) {
        this.dateAcquired = dateAcquired;
        this.description = description;
        this.originalCost = originalCost;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }
    public double value() {
        this.originalCost = value;
        return value;
    }
}
