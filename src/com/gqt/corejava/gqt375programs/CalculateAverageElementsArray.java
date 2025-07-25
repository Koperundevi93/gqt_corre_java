package com.gqt.corejava.gqt375programs;

public class CalculateAverageElementsArray {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int sum = 0;
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		int average = sum/array.length;
		System.out.println("Average of elements in the array:" +average);
	}

}
