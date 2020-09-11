package com.quantum;

import java.util.Scanner;

/**
 * 4.Calculate tips for the check(eg . Java TipCalculator < check amoiunt > <%tips>)
 */

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter check amount:");
        int input1 = scanner.nextInt();
        System.out.println("Enter tip percentage:");
        int input2 = scanner.nextInt();

        int tipAmount = (input1 * input2) / 100;
        System.out.println("Your tip for check will be: $" + tipAmount);


    }

}
