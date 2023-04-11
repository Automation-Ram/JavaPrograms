package com.prog.oopsmisc;

public class WrapperclassProg {

	public static void main(String[] args) {

		String num = "200";
		System.out.println(num + 200);

		int i = Integer.parseInt(num);
		System.out.println(i + 200);

		int num1 = 500;
		System.out.println(num1 + 100);

		String a = String.valueOf(num1);
		System.out.println(a + 500);
	}

}
