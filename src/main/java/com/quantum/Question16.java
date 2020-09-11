package com.quantum;

import java.util.Scanner;

/**
 * 16.Write a Java program that allows the user to choose the correct answer of a question. See the example below:
 * <p>
 * What is the correct way to declare a variable to store an integer value in
 * Java?
 * a. int 1x=10;
 * b. int x=10;
 * c. float x=10.0f;
 * d. string x="10";
 * Enter your choice: c
 */
public class Question16 {

    public static void main(String[] args) {
        char input;
        do {
            System.out.println("What is the correct way to declare a variable to store an integer value in Java");
            System.out.println("a. int 1x=10;\n" +
                "b. int x=10;\n" +
                "c. float x=10.0f;\n" +
                "d. string x=\"10\"");
            System.out.println("Enter your choice:");
            Scanner scanner = new Scanner(System.in);
            input = scanner.next().charAt(0);

        } while (input != 'b');
        System.out.println("Correct answer!");
    }
}
