package com.gqt.corejava.datatype;
import java.util.Scanner;

public class NonPrimitiveWrapperClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte data:");
		Byte b = new Byte(sc.nextByte());
		System.out.println("The Byte Data :" +b);
		
		System.out.println("Enter the Short data:");
		Short s = new Short(sc.nextShort());
		System.out.println("The Byte Data :" +s);
		
		System.out.println("Enter the int data:");
		Integer i = new Integer(sc.nextInt());
		System.out.println("The int Data :" +i);
		
		System.out.println("Enter the long data:");
		Long l = new Long(sc.nextLong());
		System.out.println("The Long Data :" +l);
		
		System.out.println("Enter the float data:");
		Float f = new Float(sc.nextFloat());
		System.out.println("The Float Data :" +f);
		
		System.out.println("Enter the double data:");
		Double d = new Double(sc.nextDouble());
		System.out.println("The Double Data :" +d);
		
		System.out.println("Enter the String data:");
		sc.nextLine();
		String str = new String(sc.nextLine());
		
		System.out.println("The String Data :" +str);
		
		Character c = new Character('a');
		System.out.println("Character Data :" +c);
		
		Boolean bl = new Boolean(true);
		System.out.println("Boolean Data :" +bl);
		
		sc.close();
	}

}
