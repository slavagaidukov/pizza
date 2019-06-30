package com.epam.main_task.scan;

import com.epam.main_task.messages.MessageKeys;
import com.epam.main_task.messages.PizzaMessages;

import java.util.Scanner;

public class Scan {

    public int scanOfAmountChange() {
        int inputNumber = 0;
        boolean flagOfScan = false;
        while (!flagOfScan) {
            Scanner scInt = new Scanner(System.in);
            try {
                inputNumber = scInt.nextInt();
                if (inputNumber == 1) {
                    flagOfScan = true;
                } else if (inputNumber == 2) {
                    flagOfScan = true;
                } else {
                    System.out.println(PizzaMessages.getMessage(MessageKeys.DIGIT_TWO));
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println(PizzaMessages.getMessage(MessageKeys.DIGIT_TWO));
            }
        }
        return inputNumber;
    }

    public int scanOfIngredientsAmount() {
        System.out.println(PizzaMessages.getMessage(MessageKeys.INGREDIENTS_AMOUNT));
        int inputNumber = 0;
        boolean flagOfScan = false;
        while (!flagOfScan) {
            Scanner scInt = new Scanner(System.in);
            try {
                inputNumber = scInt.nextInt();
                if (inputNumber >= 0 && inputNumber < 7) {
                    flagOfScan = true;
                } else {
                    System.out.println(PizzaMessages.getMessage(MessageKeys.DIGIT_SEVEN));
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println(PizzaMessages.getMessage(MessageKeys.DIGIT_SEVEN));
            }
        }
        return inputNumber;
    }

    public int scanOfKindsAmount() {
        System.out.println(PizzaMessages.getMessage(MessageKeys.PIZZA_KINDS));
        int inputNumber = 0;
        boolean flagOfScan = false;
        while (!flagOfScan) {
            Scanner scInt = new Scanner(System.in);
            try {
                inputNumber = scInt.nextInt();
                if (inputNumber > 0 && inputNumber < 11) {
                    flagOfScan = true;
                } else {
                    System.out.println(PizzaMessages.getMessage(MessageKeys.DIGIT_TEN));
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println(PizzaMessages.getMessage(MessageKeys.DIGIT_TEN));
            }
        }
        return inputNumber;
    }

    public int scanOfPizzaAmount() {
        System.out.println(PizzaMessages.getMessage(MessageKeys.PIZZA_AMOUNT));
        int inputNumber = 0;
        boolean flagOfScan = false;
        while (!flagOfScan) {
            Scanner scInt = new Scanner(System.in);
            try {
                inputNumber = scInt.nextInt();
                if (inputNumber > 0 && inputNumber < 21) {
                    flagOfScan = true;
                } else {
                    System.out.println(PizzaMessages.getMessage(MessageKeys.DIGIT_TWENTY));
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println(PizzaMessages.getMessage(MessageKeys.DIGIT_TWENTY));
            }
        }
        return inputNumber;
    }


    public String scanOfString() {
        System.out.println(PizzaMessages.getMessage(MessageKeys.PIZZA_NAME));
        String inputString;
        Scanner scString = new Scanner(System.in);
        inputString = scString.next();
        return inputString;
    }

    public String scanOfPizzaType() {
        System.out.println(PizzaMessages.getMessage(MessageKeys.PIZZA_TYPE));
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
                    inputOfBase = "Pizza base (Calzone)";
                    flagOfScan = true;
                } else {
                    System.out.println(PizzaMessages.getMessage(MessageKeys.DIGIT_TWO));
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println(PizzaMessages.getMessage(MessageKeys.DIGIT_TWO));
            }
        }
        return inputOfBase;
    }

    public String scanOfIngredients() {
        String ingredient = "";
        System.out.println(PizzaMessages.getMessage(MessageKeys.NEW_INGREDIENT));
        int inputNumber;
        boolean flagOfScan = false;
        while (!flagOfScan) {
            Scanner scIngredient = new Scanner(System.in);
            try {
                inputNumber = scIngredient.nextInt();
                if (inputNumber > 0 && inputNumber < 9) {
                    switch (inputNumber) {
                        case 1:
                            ingredient = "Tomato Paste";
                            flagOfScan = true;
                            break;
                        case 2:
                            ingredient = "Cheese";
                            flagOfScan = true;
                            break;
                        case 3:
                            ingredient = "Salami";
                            flagOfScan = true;
                            break;
                        case 4:
                            ingredient = "Bacon";
                            flagOfScan = true;
                            break;
                        case 5:
                            ingredient = "Garlic";
                            flagOfScan = true;
                            break;
                        case 6:
                            ingredient = "Corn";
                            flagOfScan = true;
                            break;
                        case 7:
                            ingredient = "Pepper";
                            flagOfScan = true;
                            break;
                        case 8:
                            ingredient = "Olives";
                            flagOfScan = true;
                            break;
                    }
                } else {
                    System.out.println(PizzaMessages.getMessage(MessageKeys.DIGIT_EIGHT));
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println(PizzaMessages.getMessage(MessageKeys.DIGIT_EIGHT));
            }
        }
        return ingredient;
    }
}
