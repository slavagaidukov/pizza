package com.epam.main_task;


public class Order {
    private int numberOfOrder;
    private int userID;

    public Pizza[] getPizza() {
        return pizza;
    }

    private Pizza[] pizza;
    private String orderDescription;
    private String pizzaDescription;

    public Order(int numberOfOrder, int userID, int pizzaKinds) {
        this.numberOfOrder = numberOfOrder;
        this.userID = userID;
        this.pizza = new Pizza[pizzaKinds];
        for (int i = 0; i < pizzaKinds; i++) {
            this.pizza[i] = new Pizza();
        }
    }

    public void attributesOutput(String pizzaName, int amount) {
        System.out.println(this.numberOfOrder + " : " + this.userID + " : " + pizzaName + " : " + amount);
    }

    public String toString() {
        orderDescription = "***********************" + "\nЗаказ: " + numberOfOrder + "\nКлиент: " + userID;
        //for (int i = 0; i < this.pizza.length; i++) {
        //      for (int j = 0; j < this.pizza[i].getIngredients().length ; j++) {
        //pizzaDescription = this.pizza[0].getPizzaName() + "\n-----------------------";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.pizza.length ; i++) {
            pizzaDescription = "\nНазвание: " + this.pizza[i].getPizzaName() + "\n" +
                    "---------------------";
            sb.append(pizzaDescription);
            for (int j = 0; j < pizza[i].getIngredients().length ; j++) {
                pizzaDescription = "\n" + pizza[i].getIngredients()[j] + " " + "EUR";
                sb.append(pizzaDescription);
            }
            pizzaDescription ="\n-----------------------\n" +
                    "Всего: " + " " + "EUR" + "\n" +
                    "Количество: " + this.pizza[i].getAmount() + "\n" +
                    "-------------------------";
            sb.append(pizzaDescription);
        }
        sb.append("\nОбщая сумма: " + " " + "EUR");
        return orderDescription + sb.toString();
    }
}

