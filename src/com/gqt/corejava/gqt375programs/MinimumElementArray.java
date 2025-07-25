package com.gqt.corejava.gqt375programs;

public class MinimumElementArray {

	public static void main(String[] args) {
		int[] array = {5, 2, 8, 1, 6};
		int min = array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.println("Minimum Element in the array:" +min);
	}

}
