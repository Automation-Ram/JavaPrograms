package com.prog.oopsConcepts;

public class InitializeThroughMethods {

	int id;
	String name;

	void method(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {

		InitializeThroughMethods obj = new InitializeThroughMethods();
		InitializeThroughMethods obj1 = new InitializeThroughMethods();
		obj.method(101, "Ram");
		obj1.method(102, "Rakesh");
		obj.display();
		obj1.display();

	}

}
