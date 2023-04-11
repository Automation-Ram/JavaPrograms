package com.prog.exceptionhandling;

public class ThrowProg {

	public static void ageCal(int age) {
		if (age < 18) {
			throw new ArithmeticException();
		} else {
			System.out.println("Qualified");
		}
	}

	public static void main(String[] args) {

		ageCal(13);
		System.out.println("Code ece");

	}

}
