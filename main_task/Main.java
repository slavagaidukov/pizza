package com.epam.main_task;

import com.epam.main_task.messages.MessageKeys;
import com.epam.main_task.messages.PizzaMessages;

public class Main {
    public static void main(String[] args) {

    /*Scan sc = new Scan();
        System.out.println(sc.scanOfInt());
    Order orderOne = new Order (10001,1001);
    Pizza pizzas = new Pizza ();
    pizzas.checkPizzaName("Slav",2,1001);
*/
        System.out.println(PizzaMessages.getMessage(MessageKeys.WELCOME));
        Scan scan = new Scan();
        int kindsAmount = scan.scanOfKindsAmount();
        Order orderOne = new Order(10001, 1001, kindsAmount);
        //цикл, передать аргументом кол-во видов пицц
        for (int i = 0; i < kindsAmount; i++) {
            orderOne.getPizza()[i].setPizzaType(scan.scanOfPizzaType());
            orderOne.getPizza()[i].checkPizzaName(scan.scanOfString(), i + 1, 1001);
            int ingredientsAmount = scan.scanOfIngredientsAmount();
            orderOne.getPizza()[i].setIngredients(ingredientsAmount);
            for (int j = 0; j < ingredientsAmount; j++) {
                orderOne.getPizza()[i].addIngredient(j);
                if (orderOne.getPizza()[i].getIngredients().length == ingredientsAmount) {
                    System.out.println("Your pizza is full!");
                }

            }
            orderOne.getPizza()[i].setAmount(scan.scanOfPizzaAmount());
            orderOne.getPizza()[i].setPrice(ingredientsAmount);
            orderOne.getPizza()[i].setSumOfPizza();
        }
        orderOne.setSumOfOrder(kindsAmount);
        System.out.println(orderOne);

    }
}
