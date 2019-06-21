package com.epam.main_task;


import java.util.Scanner;

public class Order {
    private int numberOfOrder;
    private int userID;
    private Pizza[] pizza;

    public Order(int numberOfOrder, int userID, int pizzaKinds) {
        this.numberOfOrder = numberOfOrder;
        this.userID = userID;
        this.pizza = new Pizza[pizzaKinds];

    }
    public void attributesOutput (int numberOfOrder,int userID, String pizzaName, int amount) {
        System.out.println(numberOfOrder + " : " + userID + " : " + pizzaName + " : " + amount);
    }
}

