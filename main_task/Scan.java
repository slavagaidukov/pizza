package com.epam.main_task;

import java.util.Scanner;

public class Scan {
    public int scanOfKindsAmount() {
        System.out.println("How many kinds of pizza do you want to order? (max - 10)");
        int inputNumber = 0;
        boolean flagOfScan = false;
        while (!flagOfScan) {
            Scanner scInt = new Scanner(System.in);
            try {
                inputNumber = scInt.nextInt();
                if (inputNumber > 0 && inputNumber < 11) {
                    flagOfScan = true;
                } else {
                    System.out.println("Please, input the digit between 1 and 10");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please, input the digit between 1 and 10");
            }
        }
        return inputNumber;
    }

    public int scanOfPizzaAmount() {
        System.out.println("How many pizza do you want to order? (max - 10)");
        int inputNumber = 0;
        boolean flagOfScan = false;
        while (!flagOfScan) {
            Scanner scInt = new Scanner(System.in);
            try {
                inputNumber = scInt.nextInt();
                if (inputNumber > 0 && inputNumber < 11) {
                    flagOfScan = true;
                } else {
                    System.out.println("Please, input the digit between 1 and 10");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please, input the digit between 1 and 10");
            }
        }
        return inputNumber;
    }


    public String scanOfString() {
        System.out.println("Please, type the name of your pizza");
        String inputString;
        Scanner scString = new Scanner(System.in);
        inputString = scString.next();
        return inputString;
    }

    public String scanOfPizzaType() {
        System.out.println("The price of the base of the pizza - 1 EUR. If you want to order closed-type pizza (Calzone - 1.5 EUR) - please, type '2' or '1' for the usual base. ");
        int inputNumber = 0;
        String inputOfBase = "";
        boolean flagOfScan = false;
        while (!flagOfScan) {
            Scanner scInt = new Scanner(System.in);
            try {
                inputNumber = scInt.nextInt();
                if (inputNumber == 1) {
                    inputOfBase = "Pizza base";
                    flagOfScan = true;
                } else if (inputNumber == 2) {
                    inputOfBase = "Calzone";

                } else {
                    System.out.println("Please, input the digit 1 or 2");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please, input the digit 1 or 2");
            }
        }
        return inputOfBase;
    }

    public String scanOfIngredients() {
        String ingredient = "";
        System.out.println("Please choose the ingredient typing its numbers (you can't choose the same element twice) :  \n 1. Tomato Paste - 1 EUR \n 2. Cheese - 1 EUR \n 3. Salami - 1.5 EUR \n 4. Bacon - 1.2 EUR \n 5. Garlic - 0.3 EUR \n 6. Corn - 0.7 EUR \n 7. Peperroni - 0.6 EUR \n 8. Olives - 0.5 EUR\n If you want to add nothing - press 0." );
        int inputNumber = 0;
        boolean flagOfScan = false;
        while (!flagOfScan) {
            Scanner scIngredient = new Scanner(System.in);
            try {
                inputNumber = scIngredient.nextInt();
                if (inputNumber > 0 && inputNumber < 9) {
                    switch (inputNumber) {
                        case 1:
                            ingredient = "Tomato Paste";
                            break;
                        case 2: ingredient = "Cheese";
                        break;
                        case 3: ingredient = "Salami";
                        break;
                        case 4: ingredient = "Bacon";
                        break;
                        case 5: ingredient = "Garlic";
                        break;
                        case 6: ingredient = "Corn";
                        break;
                        case 7: ingredient = "Pepperoni";
                        break;
                        case 8: ingredient = "Olives";
                        break;
                        case 0: ingredient = "Empty";
                    }
                } else {
                    System.out.println("Please, input the digit between 1 or 8");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please, input the digit between 1 or 8");
            }
        }
        return ingredient;
    }
}
