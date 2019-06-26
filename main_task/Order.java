package com.epam.main_task;


public class Order {
    private int numberOfOrder;
    private int userID;
    private Pizza[] pizza;
    private String orderDescription;
    private String pizzaDescription;

    public Order(int numberOfOrder, int userID, int pizzaKinds) {
        this.numberOfOrder = numberOfOrder;
        this.userID = userID;
        this.pizza = new Pizza[pizzaKinds];
        for (int i = 0; i < pizzaKinds ; i++) {
            pizza[i] = new Pizza();
        }

    }

    public void attributesOutput(String pizzaName, int amount) {
        System.out.println(this.numberOfOrder + " : " + this.userID + " : " + pizzaName + " : " + amount);
    }

    public String toString() {
        orderDescription = "***********************" + "\nЗаказ: " + numberOfOrder + "\nКлиент: " + userID + "\nНазвание: ";
        //for (int i = 0; i < this.pizza.length; i++) {
        //      for (int j = 0; j < this.pizza[i].getIngredients().length ; j++) {
        //pizzaDescription = this.pizza[0].getPizzaName() + "\n-----------------------";
        pizzaDescription= this.pizza[0].getPizzaName();

        return orderDescription  + pizzaDescription;
    }
}

