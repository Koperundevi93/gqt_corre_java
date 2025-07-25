package com.gqt.corejava.gqt375programs;

public class SecondLargestElementArray {

	public static void main(String[] args) {
		int[] array = {8,5,10,4,12};
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int value : array) {
			if(value > firstMax) {
				secondMax = firstMax;
				firstMax = value;
			}else if(value>secondMax && value!=firstMax) {
				secondMax = value;
			}
			
		}
		System.out.println("Second Largest Number in the array:" +secondMax);
	}

}
