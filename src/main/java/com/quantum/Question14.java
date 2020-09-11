package com.quantum;

import java.util.Scanner;

/**
 * Write a JAVA program that will generate/output the following numbers.
 * 1, 2, 4, 7, 11, 16, 32, 39, 47, 56, 66
 */
public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int input = scanner.nextInt();
        int sum = 1;
        for (int i = 0; i < input; i++) {
            sum = sum + i;
            System.out.print(sum + " ");
        }
    }

}
