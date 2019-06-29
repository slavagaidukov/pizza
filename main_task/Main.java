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

        orderOne.getPizza()[0].setPizzaType(scan.scanOfPizzaType());
//pizzanumber
        orderOne.getPizza()[0].checkPizzaName(scan.scanOfString(), kindsAmount, 1001);
        int ingredientsAmount = scan.scanOfIngredientsAmount();
        orderOne.getPizza()[0].setIngredients(ingredientsAmount);
        for (int i = 0; i < ingredientsAmount; i++) {
            String ingredient = orderOne.getPizza()[0].addIngredient(i);
            if (orderOne.getPizza()[0].getIngredients().length==ingredientsAmount) {
                System.out.println("Your pizza is full!");
            }

        }
        orderOne.getPizza()[0].setAmount(scan.scanOfPizzaAmount());
        orderOne.getPizza()[0].checkAdd();
        System.out.println(orderOne);


    }
}
