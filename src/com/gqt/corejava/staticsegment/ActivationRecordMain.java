package com.gqt.corejava.staticsegment;
class Dog{
	String name;
	String color;
	String breed;
	int cost;
	void run() {
		System.out.println("Dog runs");
	}
	void eat() {
		System.out.println("Dog eats");
	}
}
public class ActivationRecordMain {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		System.out.println("name=" +d1.name);
		System.out.println("color=" +d1.color);
		System.out.println("breed=" +d1.breed);
		System.out.println("cost=" +d1.cost);
		System.out.println("----------");
		d1.name="Jimmy";
		d1.color="Brown";
		d1.breed="Pug";
		d1.cost=6000;
		System.out.println("name=" +d1.name);
		System.out.println("color=" +d1.color);
		System.out.println("breed=" +d1.breed);
		System.out.println("cost=" +d1.cost);
		System.out.println("----------");
		d1.run();
		d1.eat();	
	}

}
