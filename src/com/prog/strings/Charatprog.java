package com.prog.strings;

public class Charatprog {

	public static void main(String[] args) {

		String name = "Automation Test Engineer";
		int length = name.length();
		System.out.println(length);
		System.out.println(name.charAt(5));

		System.out.println(name.contains("Test"));

		System.out.println(name.endsWith("Test Engineer"));

		String join = String.join("*", "Welcome", "to" ,"Australia");

		System.out.println(join);
		System.out.println(name.replace('A', 'e'));
		System.out.println(name.replaceAll("Test", "QA"));

	}

}
