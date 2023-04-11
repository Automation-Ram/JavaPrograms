package com.prog.strings;

public class EqualsProg {

	public static void main(String[] args) {

		String name = "Automatio";
		String name1 = "Automatio";
		String name2= new String("Automation");

		//System.out.println(name.equals(name1));
		//System.out.println(name == name2);
		System.out.println(name.compareTo(name2));

	}

}
