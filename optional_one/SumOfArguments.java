package com.epam.optional_one;

public class SumOfArguments {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        for (int i = 0; i < args.length; i++) {
            number = Integer.valueOf(args[i]);
            sum += number;
        }
        System.out.println(sum);
    }
}
