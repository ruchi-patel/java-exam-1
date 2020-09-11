package com.quantum;

import java.util.Scanner;

/**
 * 13.Write a program to remove White Spaces from string in Java?
 * ”Enter input string to be cleaned from white spaces...!”
 * INPUT :OneSpace TwoSpaces ThreeSpaces FourSpaces Tab End
 */

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input string to be cleaned from white spaces...!:");
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                sb.append(input.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
