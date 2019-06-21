package com.epam.optional_three;

import java.util.Scanner;

public class Scan {
    public int scanOfInput() {
        boolean flagInScan = false;
        int intDigitOfMonth = 0;
        while (!flagInScan) {
            Scanner digitOfMonth = new Scanner(System.in);
            intDigitOfMonth = digitOfMonth.nextInt();
            if (intDigitOfMonth > 0 && intDigitOfMonth < 13) {
                flagInScan = true;
            } else {
                System.out.println("Please, input the correct number");
            }
        }
        return intDigitOfMonth;
    }
}
