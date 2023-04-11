package com.prog.oopsmisc;

public class CallByValuye {

	public static void main(String[] args) {
		CallByValuye obj = new CallByValuye();

		addition(500, 500);
		int x = 10;
		int y = 20;
		obj.addition(x, y);
		System.out.println(addition(x, y));

	}

	public static int addition(int a, int b) {

		return a + b;
	}

}
