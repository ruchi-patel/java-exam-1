package com.quantum;

import java.util.Scanner;

/**
 * 8.Write Java Program using for-loop statement Excepted Output :How Many Rows You Want to Print ? 8
 *
 *          1
 *         1 2
 *        1 2 3
 *       1 2 3 4
 *      1 2 3 4 5
 *     1 2 3 4 5 6
 *    1 2 3 4 5 6 7
 *   1 2 3 4 5 6 7 8
 */
public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Rows You Want to Print ?");
        int input = scanner.nextInt();

        for (int i = input; i > 0; i--) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j > 0; j--) {
                sb.append(" ");
            }
            for (int k = 1; k <= input - (i - 1); k++) {
                sb.append(k).append(" ");
            }
            System.out.println(sb);
        }
    }
}
