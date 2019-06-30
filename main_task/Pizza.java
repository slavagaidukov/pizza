package com.epam.main_task;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pizza {


    public double getSumOfPizza() {
        return sumOfPizza;
    }

    public void setSumOfPizza() {
        for (int i = 0; i < this.getPrice().length ; i++) {
            sumOfPizza = sumOfPizza+getPrice()[i];
        }
        sumOfPizza = sumOfPizza + getPriceOfPizzaBase();
    }

    private double sumOfPizza;

    public double[] getPrice() {
        return price;
    }

    public void setPrice(int amountOfIngredients) {
        this.price = new double[amountOfIngredients];
        for (int i = 0; i < amountOfIngredients; i++) {
            switch (this.ingredients[i]){
                case "Tomato Paste": this.price[i]=1;
                break;
                case "Cheese": this.price[i] = 1;
                break;
                case "Salami": this.price[i] = 1.5;
                break;
                case "Bacon": this.price[i] = 1.2;
                break;
                case "Garlic": this.price[i] = 0.3;
                break;
                case "Corn": this.price[i] = 0.7;
                break;
                case "Pepperoni": this.price[i] = 0.6;
                break;
                case "Olives": this.price[i] = 0.5;
                break;
            }
        }
    }

    private double[] price;

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

    public double getPriceOfPizzaBase() {
        return priceOfPizzaBase;
    }

    public void setPriceOfPizzaBase(double priceOfPizzaBase) {
        this.priceOfPizzaBase = priceOfPizzaBase;
    }

    private double priceOfPizzaBase;

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
        if (pizzaType=="Pizza base") {
            setPriceOfPizzaBase(1.0);
        }
        else {
            setPriceOfPizzaBase(1.5);
        }
    }

    public String getPizzaType() {
        return pizzaType;
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
}




