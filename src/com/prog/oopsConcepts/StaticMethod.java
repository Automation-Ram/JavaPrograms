package com.prog.oopsConcepts;

public class StaticMethod {

	static int i = 10;
	static String name = "Ram";

	public static void method1() {
		System.out.println("Static method");
	}

	public static void main(String[] args) {

		System.out.println(StaticMethod.i);
		StaticMethod.method1();

	}

}
