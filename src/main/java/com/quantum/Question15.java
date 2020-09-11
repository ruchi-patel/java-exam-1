package com.quantum;

import java.util.Scanner;

/**
 * Write a Java program to detect key presses.
 * If the user pressed number keys( from 0 to 9),
 * the program will tell the number that is pressed, otherwise, program will show "Not allowed".
 */
public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input:");
        String input = scanner.nextLine();
        if (input.length() == 1 && Character.isDigit(input.charAt(0))) {
            System.out.println(input);
        } else {
            System.out.println("Invalid input");
        }
    }
}
