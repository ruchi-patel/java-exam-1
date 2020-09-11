package com.quantum;

import java.util.Scanner;

/**
 * Write a program to input indefinite numbers and then calculate the sum of only the positive numbers.
 * The program terminates when negative numbers is input
 */
public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input number:");
        int input = scanner.nextInt();
        int sum = 0;
        while (input > 0) {
            sum = sum + input;
            System.out.println("Enter input number:");
            input = scanner.nextInt();
        }
        System.out.println("Total sum of positive numbers: " + sum);
    }
}
