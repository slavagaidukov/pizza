package com.epam.main_task;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pizza {


    public String getPizzaName() {
        return pizzaName;
    }

    private String pizzaName;


    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(int amountOfIngredients) {
        this.ingredients = new String[amountOfIngredients];
        }

    private String[] ingredients;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private int amount;


    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    private String pizzaType;



    public String checkPizzaName(String pizzaNameNotChecked, int amount, int userID) {
        Pattern patternOne = Pattern.compile("^[a-zA-Z]{4,20}$");
        Matcher matcherOne = patternOne.matcher(pizzaNameNotChecked);
        boolean defaultNameFlag = matcherOne.matches();
        if (defaultNameFlag == true) {
            this.pizzaName = pizzaNameNotChecked;
        } else {
            this.pizzaName = (String.valueOf(userID) + "_" + String.valueOf(amount));
        }
        return pizzaName;
    }

    public int amountChange() {
        Scan scanOfNewAmount = new Scan();
        this.amount = scanOfNewAmount.scanOfPizzaAmount();
        return amount;
    }

    public String addIngredient(int numberOfIngredient) {
        Scan ingredientsScan = new Scan();
        String ingred = "";
        boolean flagOfAddIngredient = false;
        while (!flagOfAddIngredient) {
          ingred = ingredientsScan.scanOfIngredients();
         if (!Arrays.asList(ingredients).contains(ingred) || ingred.equals("")) {
                this.ingredients[numberOfIngredient] = ingred;
                flagOfAddIngredient = true;
            } else {
                System.out.println("Please, choose another ingredient");
            }
        }
        return ingred;
    }

    public void checkAdd() {
        for (int i = 0; i < ingredients.length; i++) {
            System.out.println(ingredients[i]);
        }
    }

}




