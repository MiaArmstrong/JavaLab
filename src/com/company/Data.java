package com.company;

/**
 * Created by Mia on 2/19/2015.
 */
public class Data extends Tools {


    public void displayOdds() {
        System.out.println("\nOdd numbers from 1 to 100.\n");
        int j = 0;
        for (int i = 0; i < 100; ++i) {
            ++i;
            if (j == 10) {
                System.out.println();
                j = 0;
            }
            System.out.print(i + " ");
            ++j;
        }
    }

    public void displayOddsNotDivisible() {
        System.out.println("\n\nOdd number from 1 to 100 that are not evenly divisible by 3 or 5\n");
        int j = 0;
        for (int i = 0; i < 100; ++i) {
            ++i;
            if (j == 10) {
                System.out.println();
                j = 0;
            }
            if (i % 3 != 0 && i % 5 != 0)
                System.out.print(i + " ");
            ++j;
        }
    }
}
