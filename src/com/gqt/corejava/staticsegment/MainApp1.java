package com.gqt.corejava.staticsegment;
 //use of Scanner
import java.util.Scanner;

class Farmer {
	double principle;
	static double rate;
	double time;
	double si;
	
	static {
		rate=2.789;
	}
	
	void collectdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle:");
		principle = sc.nextDouble();
		System.out.println("Enter the time:");
		time=sc.nextDouble();
	}
	
	
	void calculate() {
		si = (principle*time*rate)/100;
	}
	
	void display() {
		System.out.println("SI="+si);
	}
}

	public class MainApp1 {
		public static void main(String[] args) {
			Farmer f1 = new Farmer();
			Farmer f2 = new Farmer();
			Farmer f3 = new Farmer();
			System.out.println("Farmer1");
			f1.collectdata();
			f1.calculate();
			f1.display();
			System.out.println("---------");
			System.out.println("Farmer2");
			f2.collectdata();
			f2.calculate();
			f2.display();
			System.out.println("---------");
			System.out.println("Farmer3");
			f3.collectdata();
			f3.calculate();
			f3.display();
			System.out.println("---------");
	}

}
