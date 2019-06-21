package com.epam.optional_three;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, input the number of month");
        Scan scan = new Scan();
        MonthProcessing monthProcessing = new MonthProcessing();
        System.out.println("Your month is " + monthProcessing.processing(scan.scanOfInput()));
    }
}
