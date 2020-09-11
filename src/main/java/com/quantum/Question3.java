package com.quantum;

import java.util.Scanner;

/**
 * 3.Write a Fibonacci’s series program as 0 1 1 2 3 5 8...n numbers and run in the command prompt
 */
public class Question3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input number:");
        int input = scanner.nextInt();
        int element1 = 0;
        int element2 = 1;
        if (input >= 1) {
            System.out.print(element1 + " ");
        }
        if (input >= 2) {
            System.out.print(element2 + " ");
        }
        for (int i = 2; i < input; i++) {
            int sum = element1 + element2;
            element1 = element2;
            element2 = sum;
            System.out.print(sum + " ");
        }

    }
}
