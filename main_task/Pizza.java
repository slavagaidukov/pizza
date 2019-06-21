package com.epam.main_task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pizza {

    private String pizzaName;
    private String [] ingredients;
    private int amount;
    private String pizzaType;

    public Pizza(String pizzaType) {
        this.pizzaType = pizzaType;
    }


    public String checkPizzaName (String pizzaNameNotChecked,int amount,int userID) {
        Pattern patternOne = Pattern.compile("^[a-zA-Z]{4,20}$");
        Matcher matcherOne = patternOne.matcher(pizzaNameNotChecked);
        boolean defaultNameFlag = matcherOne.matches();
        if (defaultNameFlag==true) {
            this.pizzaName = pizzaNameNotChecked;
        }
        else {
            this.pizzaName = (String.valueOf(userID)+ "_" + String.valueOf(amount));
        }
        System.out.println(pizzaName);
        return pizzaName;
    }
    public int amountChange () {
        Scan scanOfNewAmount = new Scan();
        this.amount = scanOfNewAmount.scanOfPizzaAmount();
        return amount;
    }

    public void addIngredient () {
        Scan ingredientsScan = new Scan();
        for (int i = 0; i < 7 ; i++) {
            ingredients[i]= ingredientsScan.scanOfIngredients();
        }
        System.out.println("Your pizza is full");
        for (int i = 0; i < 7 ; i++) {
            if (ingredients[i])
        }
    }
}


