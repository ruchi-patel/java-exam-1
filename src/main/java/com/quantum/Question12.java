package com.quantum;

import java.util.Scanner;

/**
 * 12.By using do while loop, write Java program to prompt the user to choose the correct answer from a list of answer choices of a question.
 * <p>
 * What is the command keyword to exit a loop in Java?
 * a.quit
 * b.continue
 * c.break
 * d.exit
 * Enter your choice:b
 * Incorrect!
 * Again? press y to continue:y
 * Enter your choice:c
 * Congratulation!
 * Again? press y to continue:y
 * Enter your choice:a
 * Incorrect!
 * Again? press y to continue:d
 */

public class Question12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;
        do {
            System.out.println("What is the command keyword to exit a loop in Java? ");
            System.out.println("a.quit\n" +
                "b.continue\n" +
                "c.break\n" +
                "d.exit\n ");
            input = scanner.next().charAt(0);
            if (input == 'c') {
                System.out.println("Congratulations!");
            } else {
                System.out.println("Incorrect.");
            }
            System.out.println("Again? press y to continue");
            input = scanner.next().charAt(0);
        } while (input == 'y');
    }
}
