/**
 * @author 
 * @category patterns
 * @description This is an example for conditional pattern
 **/
package com.gqt.corejava.patterns;

import java.util.Scanner;

/**
 * 
 */
public class Pattern39 {

	/**
	 * @param args
	 * @description This contains code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 ||i==(n-1) || j==(n-1) || i==j || i==(n/2) || 
					j==(n/2) || i+j==(n-1) || i+j==(n/2) || i-j==n/2 || j-i==(n/2) ||
					i+j==((n-1)+(n/2))) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
		
		System.out.print("		");
		for(int j=0;j<n;j++) {
			if(i==0 || j==0 ||i==(n-1) || j==(n-1) || i==j || i==(n/2) || 
				j==(n/2) || i+j==(n-1) || i+j==(n/2) || i-j==n/2 || j-i==(n/2) ||
				i+j==((n-1)+(n/2))) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}

			System.out.println();
			
		
		}
		

	}

}