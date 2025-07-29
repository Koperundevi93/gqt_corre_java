/* # 
 * # #
 * # - #
 * # - - #
 * # # # # #
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
public class Pattern37 {

	/**
	 * @param args
	 * @description This contains code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=i;j++) {
				if(i==1 || i==n ||j==1 || j==i) {
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
