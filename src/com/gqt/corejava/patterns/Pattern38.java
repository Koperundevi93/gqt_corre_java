/* 
 * - - - - - $     
 * - - - - $ $ $
 * - - $ $ $ $ $ $
 * - $ $ $ $ $ $ $ $
 * $ $ $ $ $ $ $ $ $ $
 * 
 */
/**
 * @author 
 * @category patterns
 * @description This is an example for conditional pattern
 */
package com.gqt.corejava.patterns;
import java.util.Scanner;
/**
 * 
 */
public class Pattern38 {

	/**
	 * @param args
	 * @description This contains code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("$ ");
			}
			System.out.println();
			
		}

	}

}
