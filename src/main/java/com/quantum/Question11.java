package com.quantum;

/**
 * Write a program to print year from 1 to 4000 except leap years using Continue statement.
 */

public class Question11 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4000; i++) {
            if (i % 400 == 0) {
                continue;
            } else if (i % 4 == 0 && i % 100 != 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
