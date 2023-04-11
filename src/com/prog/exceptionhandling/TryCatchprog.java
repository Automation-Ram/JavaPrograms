package com.prog.exceptionhandling;

public class TryCatchprog {

	public static void main(String[] args) {

		try {
			int num = 500 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Code run");

	}

}
