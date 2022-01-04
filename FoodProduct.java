package com.mycitrus;

public class FoodProduct implements Product{

    public String productType;
    public String productAction;
    public String owner;
    public String productName;

    public FoodProduct(String name, String productType, String productAction, String owner){
        this.productType = productType;
        this.productAction = productAction;
        this.owner = owner;
        this.productName = name;
    }

    public FoodProduct(String name, String productType, String productAction){
        this.productName = name;
        this.productType = productType;
        this.productAction = productAction;
        this.owner = "N/A";
    }

    public void assignOwner(String owner){
        this.owner = owner;
    }

    @Override
    public void performAction(){
        System.out.println(this.productAction);
    }
    @Override
    public void getType() {
        System.out.println(this.productName + " is a " + this.productType);
    }
}
