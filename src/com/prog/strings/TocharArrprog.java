package com.prog.strings;

public class TocharArrprog {

	public static void main(String[] args) {

		String name = "India is my own country";

		char[] ch = name.toCharArray();
		int len = name.length();

		for (int i = 0; i < len; i++) {
			System.out.println(ch[i]);
		}

	}

}
