package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print( " ");
			}
			int counter = 2;
			for(int k=1;k<=2*i-1;k++) {
				if (k<=i) {
					System.out.print(" "+k);	
				}
				else {
					System.out.print(" "+(k-counter));
					counter += 2;
				}
				
			} 
			
			System.out.println();
		}

	}

}
