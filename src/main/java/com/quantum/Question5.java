package com.quantum;

import java.util.Scanner;

/**
 * 5.Take a year as input and Print the year is leap year or not a leap year using Nested-if else statement
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        int input = scanner.nextInt();
        if (input % 400 == 0) {
            System.out.println("It is a leap year.");
        } else if (input % 4 == 0 && input % 100 != 0) {
            System.out.println("It is a leap year.");
        } else {
            System.out.println("It is not a leap year.");
        }
    }
}
