package com.quantum;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/**
 * 7.Write a program using nested switch statement.
 * Take input from user in form of “” and print the current running movies at the theater.
 * E.g.
 * Input : 1F output: “In fairfax cinemax currently running movie : thor”. Make up your own data.
 */

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter State:");
        String state = scanner.nextLine();

        System.out.println("Enter city:");
        String city = scanner.nextLine();

        switch (state) {
            case "Virginia":
                switch (city) {
                    case "Fairfax":
                        System.out.println("The zipcode of fairfax is 20131.");
                        break;
                    case "Herndon":
                        System.out.println("The zipcode of Herndon is 20171. ");
                        break;

                }
            case "New York":
                switch (city) {
                    case "Queens":
                        System.out.println("The zipcode of fairfax is 20121.");
                        break;
                    case "Manhattan":
                        System.out.println("The zipcode of Herndon is 20101. ");
                        break;

                }
            default:
                System.out.println("We do not have the information.");
        }
    }
}
