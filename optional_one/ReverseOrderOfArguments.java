package com.epam.optional_one;

public class ReverseOrderOfArguments {
    public static void main(String[] args) {
        for (int numberOfArguments = args.length; numberOfArguments > 0; numberOfArguments--) {
            System.out.println(args[numberOfArguments - 1]);
        }
    }
}
