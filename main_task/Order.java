package com.epam.main_task;

import java.time.LocalTime;

public class Order {
    public LocalTime getLocalTime() {
        return localTime;
    }

    private LocalTime localTime = LocalTime.now();
    private int numberOfOrder;
    private int userID;

    public Pizza[] getPizza() {
        return pizza;
    }

    private Pizza[] pizza;
    private String orderDescription;
    private String pizzaDescription;

    public double getSumOfOrder() {
        return sumOfOrder;
    }

    public void setSumOfOrder(int amountOfOrder) {
        for (int i = 0; i < amountOfOrder; i++) {
            sumOfOrder = sumOfOrder + this.pizza[i].getSumOfPizza()*this.pizza[i].getAmount();
        }
    }

    private double sumOfOrder;

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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.pizza.length ; i++) {
            pizzaDescription = "\nНазвание: " + this.pizza[i].getPizzaName() + "\n" +
                    "---------------------------\n" + pizza[i].getPizzaType() + " " + pizza[i].getPriceOfPizzaBase() + " EUR";
            sb.append(pizzaDescription);
            for (int j = 0; j < pizza[i].getIngredients().length ; j++) {
                pizzaDescription = "\n" + pizza[i].getIngredients()[j] + " " + pizza[i].getPrice()[j] + " EUR";
                sb.append(pizzaDescription);
            }
            pizzaDescription ="\n---------------------------\n" +
                    "Всего: " + pizza[i].getSumOfPizza() + " EUR" + "\n" +
                    "Количество: " + this.pizza[i].getAmount() + "\n" +
                    "---------------------------";
            sb.append(pizzaDescription);
        }
        sb.append("\nОбщая сумма: " + getSumOfOrder() + " EUR");
        System.out.println(getLocalTime());
        return orderDescription + sb.toString();
    }
}

