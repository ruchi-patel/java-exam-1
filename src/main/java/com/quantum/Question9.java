package com.quantum;

import java.util.Scanner;

/**
 * 9.Write Java Program using for-loop statement Excepted Output :How Many Rows You Want to Print ?
 *
 * Here Is Your pattern
 *          1
 *         2 2
 *        3 3 3
 *       4 4 4 4
 *      5 5 5 5 5
 *     6 6 6 6 6 6
 *    7 7 7 7 7 7 7
 *   8 8 8 8 8 8 8 8
 *  9 9 9 9 9 9 9 9 9
 */
public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Rows You Want to Print ?");
        int input = scanner.nextInt();
        int number = 1;
        for (int i = input; i > 0; i--) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j > 0; j--) {
                sb.append(" ");
            }
            for (int k = 1; k <= input - (i - 1); k++) {
                sb.append(number).append(" ");
            }
            number++;
            System.out.println(sb);

        }
    }
}
