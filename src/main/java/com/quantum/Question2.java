package com.quantum;

import java.util.Scanner;

/**
 * 2.Take a number from user and Print if the number is less than 200
 * and even number otherwise print invalid number using Logical Operator
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input number:");
        int input = scanner.nextInt();
        if (input < 200 && input % 2 == 0) {
            System.out.println("Valid number.");
        } else {
            System.out.println("Invalid number.");
        }

    }
}
