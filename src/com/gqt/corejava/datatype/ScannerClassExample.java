package com.gqt.corejava.datatype;

import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte data:");
		byte b = sc.nextByte();
		System.out.println("The Byte Data :" +b);
		
		System.out.println("Enter the Short data:");
		short s = sc.nextShort();
		System.out.println("The Short Data :" +s);
		
		System.out.println("Enter the int data:");
		int i = sc.nextInt();
		System.out.println("The Int Data :" +i);
		
		System.out.println("Enter the long data:");
		long l = sc.nextLong();
		System.out.println("The Long Data :" +l);
		
		System.out.println("Enter the float data:");
		float f = sc.nextFloat();
		System.out.println("The Float Data :" +f);
		
		System.out.println("Enter the double data:");
		double d = sc.nextDouble();
		System.out.println("The Double Data :" +d);
		
		System.out.println("Enter the String :");
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println("The String Data :" +str);
		
		
		sc.close();
	}

}
