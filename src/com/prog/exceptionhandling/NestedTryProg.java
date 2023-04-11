package com.prog.exceptionhandling;

public class NestedTryProg {

	public static void main(String[] args) {

		try {

			try {
				int num = 10 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[] = new int[1];
				System.out.println(a[2]);
			} catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1);
			}

		} catch (Exception e) {
			System.out.println("Execute the code");
		} 
			  finally { System.out.println("Handled or not execute the code"); }
			 

	}

}
