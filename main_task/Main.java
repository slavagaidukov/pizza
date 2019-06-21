package com.epam.main_task;

public class Main {
    public static void main(String[] args) {

    /*Scan sc = new Scan();
        System.out.println(sc.scanOfInt());
    Order orderOne = new Order (10001,1001);
    Pizza pizzas = new Pizza ();
    pizzas.checkPizzaName("Slav",2,1001);
*/
        Scan scan = new Scan();
        Order orderOne = new Order (10001,1001,scan.scanOfKindsAmount());
        //цикл, передать аргументом кол-во видов пицц
        Pizza pizza = new Pizza(scan.scanOfPizzaType());
        pizza.checkPizzaName(scan.scanOfString(),scan.scanOfPizzaAmount(),1001);

        pizza.addIngredient();






    }
        }
