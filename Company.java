package com.mycitrus;

public class Company {
    // all variables are protected to prevent tampering
    protected String name;
    protected String ceo;
    protected double profit;

    // constructor method
    public Company(String name, String ceo, double profit) {
        this.name = name;
        this.ceo = ceo;
        this.profit = profit;
    }

    // getter for company names
    public String getName() {
        return this.name;
    }
    // setter for company names
    public void setName(String name) {
        this.name = name;
    }

    public String getCeo() {
        return this.ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public double getProfit() {
        return this.profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
