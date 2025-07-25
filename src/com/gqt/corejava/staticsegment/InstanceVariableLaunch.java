package com.gqt.corejava.staticsegment;
class Dog
{
	String name;
	String color;
	String breed;
	int cost;
	
	void allocateData() {
		name = "Rocky";
		color = "Black";
		breed = "Pug";
		cost	 = 15000;
	}
	void displayData()
	{
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
	}
}
public class InstanceVariableLaunch {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.name = "Sammy";
		d1.allocateData();
		d1.displayData();
	
	}

}
