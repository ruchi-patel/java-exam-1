package com.quantum;

import java.util.Scanner;

/**
 * 1. Take input from the user and Print if the number is less than or greater than 100 using Ternary Operator.
 */

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input number:");
        int input = scanner.nextInt();
        String output = (input > 100) ? "Greater" : "Lesser";
        System.out.println("The number you entered is " + output + " than 100.");
    }
}
