package com.gqt.corejava.patterns;

import java.util.Scanner;

/* # # # # #
 * # - - - #
 * # - - - #
 * # - - - #
 * # # # # #
 * 
 */
/**
 * @author 
 * @category patterns
 * @description This is an example for conditional pattern
 */
public class Pattern36 {
/**
 * 
 * @param args
 * @description This contains code for the pattern
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 ||j==0 || j==n-1) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
			
		}
	}

}
