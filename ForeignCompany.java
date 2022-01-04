package com.mycitrus;

// ForeignCompany inherits get and set methods from Company+
public class ForeignCompany extends Company {
    protected String country;
    protected String name;
    protected String ceo;
    protected double profit;

    public ForeignCompany(String name, String ceo, double profit, String country){
        super(name, ceo, profit);
        this.country = country;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String country){
        this.country = country;
    }
}
