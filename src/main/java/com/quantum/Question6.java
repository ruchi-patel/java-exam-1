package com.quantum;

import java.util.Scanner;

/**
 * 6.Check whether an alphabet is vowel or consonant using switch statement
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input alphabet:");
        char input = scanner.next().charAt(0);
        switch (input) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a vowel.");
                break;
            default:
                System.out.println("It is a consonant.");
                break;
        }

    }
}
