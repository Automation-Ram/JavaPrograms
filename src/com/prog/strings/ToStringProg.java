package com.prog.strings;

public class ToStringProg {

	String name;
	int id;

	public ToStringProg(String name, int id) {

		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}

	public static void main(String[] args) {

		ToStringProg obj = new ToStringProg("Ram", 12345);
		System.out.println(obj);

	}

}
