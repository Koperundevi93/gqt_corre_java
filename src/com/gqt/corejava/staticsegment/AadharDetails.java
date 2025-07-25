package com.gqt.corejava.staticsegment;

import java.util.Scanner;

class AadharData {
	String Name;
	String DoB;
	String Gender;
	String Address;
	int AadharNumber;
	static String Nationality;
	
	static {
		Nationality = "Indian";
	}
	
	void allocateData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		Name = sc.nextLine();
		System.out.println("Enter the DoB:");
		DoB = sc.nextLine();
		System.out.println("Enter the Gender:");
		Gender = sc.nextLine();
		System.out.println("Enter the Address:");
		Address = sc.nextLine();
		System.out.println("Enter the AadharNumber:");
		AadharNumber = sc.nextInt();
		
	}
		
}
public class AadharDetails {

	public static void main(String[] args) {
		AadharData a1 = new AadharData();
		System.out.println("User1:");
		a1.allocateData();
	}

}
