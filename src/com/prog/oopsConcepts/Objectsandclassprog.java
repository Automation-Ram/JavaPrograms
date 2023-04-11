package com.prog.oopsConcepts;

public class Objectsandclassprog {

	int num = 100;
	String name = "Automation";

	public void firstMethod() {
		System.out.println("Method 1");
	}

	public static void main(String[] args) {

		Objectsandclassprog obj = new Objectsandclassprog();
		System.out.println(obj.name);
		System.out.println(obj.num);
		obj.firstMethod();

	}

}
