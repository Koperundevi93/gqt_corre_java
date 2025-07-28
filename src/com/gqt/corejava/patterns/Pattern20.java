package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Pattern20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Count:");
        int n = sc.nextInt();  // Input should be taken after the prompt

        for(int i = 1; i <= n; i++) {
            // Print n hyphens
            for(int j = 1; j <= n; j++) {
                System.out.print("- ");
            }

            // Print n at symbols
            for(int j = 1; j <= n; j++) {
                System.out.print("@ ");
            }

            // Move to next line after each row
            System.out.println();
        }

        sc.close(); // Always good to close the scanner
    }
}


