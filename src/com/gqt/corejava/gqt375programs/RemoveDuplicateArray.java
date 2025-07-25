package com.gqt.corejava.gqt375programs;

import java.util.Arrays;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,1};
		int[] uniqueArray = Arrays.stream(array).distinct().toArray();
		
		System.out.println("Array after removing duplicates:");
		for(int value:uniqueArray) {
			System.out.print(value+"");
		}
		
	}

}
