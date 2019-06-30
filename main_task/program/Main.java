package com.epam.main_task.program;

import com.epam.main_task.models.Order;
import com.epam.main_task.scan.Scan;
import com.epam.main_task.messages.MessageKeys;
import com.epam.main_task.messages.PizzaMessages;

public class Main {
    public static void main(String[] args) {


        Scan scan = new Scan();
        int kindsAmount = scan.scanOfKindsAmount();
        Order orderOne = new Order(10001, 1001, kindsAmount);
        for (int i = 0; i < kindsAmount; i++) {
            orderOne.getPizza()[i].setPizzaType(scan.scanOfPizzaType());
            orderOne.getPizza()[i].checkPizzaName(scan.scanOfString(), i + 1, 1001);
            int ingredientsAmount = scan.scanOfIngredientsAmount();
            orderOne.getPizza()[i].setIngredients(ingredientsAmount);
            for (int j = 0; j < ingredientsAmount; j++) {
                orderOne.getPizza()[i].addIngredient(j);
                if (orderOne.getPizza()[i].getIngredients().length == ingredientsAmount) {
                    System.out.println(PizzaMessages.getMessage(MessageKeys.FULL));
                }

            }
            orderOne.getPizza()[i].setAmount(scan.scanOfPizzaAmount());
            System.out.println(PizzaMessages.getMessage(MessageKeys.AMOUNT_CHANGE));
            if (scan.scanOfAmountChange() == 1) {
            } else {
                orderOne.getPizza()[i].setAmount(scan.scanOfPizzaAmount());
            }
            orderOne.getPizza()[i].setPrice(ingredientsAmount);
            orderOne.getPizza()[i].setSumOfPizza();
        }
        orderOne.setSumOfOrder(kindsAmount);
        System.out.println(orderOne);

    }
}
