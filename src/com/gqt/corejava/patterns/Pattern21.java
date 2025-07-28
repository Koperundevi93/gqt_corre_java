package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();  // e.g., 5

        for (int i = 1; i <= n; i++) {
            // Print i dashes
            for (int j = 1; j <= i; j++) {
                System.out.print("-");
            }

            // Print (n - i + 1) hashes
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("#");
            }

            System.out.println();
        }

        sc.close();
    }
}
