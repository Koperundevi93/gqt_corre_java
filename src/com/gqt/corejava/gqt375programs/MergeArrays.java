package com.gqt.corejava.gqt375programs;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int[] array1 = {1,2,3};
		int[] array2 = {4,5,6};
		
		int[] mergedArray = new int[array1.length + array2.length];
		
		System.arraycopy(array1, 0, mergedArray, 0, array1.length);
		System.arraycopy(array2, 0, mergedArray, array1.length,array2.length);
		
		System.out.print("Merged array: " +Arrays.toString(mergedArray));

	}

}
