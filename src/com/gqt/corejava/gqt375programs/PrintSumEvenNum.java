package com.gqt.corejava.gqt375programs;

public class PrintSumEvenNum {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				sum = sum + i;
			}
			
			}
			
		System.out.println("Sum of Even numbers from 1 to 100 is " +sum);

	}

}
