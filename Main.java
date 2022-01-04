package com.mycitrus;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // create companies
	    Company nestle = new Company("Nestle", "John Brown", 12300000);
        Company pepsico = new Company("PepsiCo", "Jane Smith", 564000);
        Company disney = new Company("Disney", "Doug Bowser", 789000);

        // create ForeignCompany
        ForeignCompany sega = new ForeignCompany("Sega", "Yuki Samoto", 456123, "Japan");

        // test if inherited methods work in subclass ForeignCompany
        sega.setProfit(1200);
        // System.out.println(sega.getProfit()); this is commented out to reduce number of printed statements

        // put companies into a list
        ArrayList<Company> CompanyList = new ArrayList<Company>();
        CompanyList.add(nestle);
        CompanyList.add(pepsico);
        CompanyList.add(disney);
        CompanyList.add(sega);

        // Create four food products
        FoodProduct oreo = new FoodProduct("Oreo", "Snack", "Eat the Oreos!");
        FoodProduct banana = new FoodProduct("Banana", "Snack", "Peel the Banana!");
        FoodProduct milkShake = new FoodProduct("Milkshake", "Drink", "Drink the Milkshake!");
        FoodProduct cocaCola = new FoodProduct("CocaCola", "Drink", "Chug the Coke Can!");

        // Add food products to a list
        FoodProduct[] foodList = new FoodProduct[4];
        foodList[0] = oreo;
        foodList[1] = banana;
        foodList[2] = milkShake;
        foodList[3] = cocaCola;

        // Assign each company a product
        int iter = 0;
        for (Company e: CompanyList){
            foodList[iter].assignOwner(e.name);
            iter++;
        }

        // Print out all product owners
        for (FoodProduct f: foodList){
            System.out.println(f.owner + " owns " + f.productName);
        }

        // Print out line of separation for the console
        System.out.println("------------------");

        // Print out all product action text
        for (FoodProduct f: foodList) {
            f.performAction();
        }

        // Print out line of separation for the console
        System.out.println("------------------");

        // Print out all product types
        for (FoodProduct f: foodList){
            f.getType();
        }
    }
}
