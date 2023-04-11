package com.prog.strings;

public class SplitProg {

	public static void main(String[] args) {

		String name = "Australia is my own country";
		String[] spt = name.split("\\s");
		for (String s : spt) {
			System.out.println(s);
		}

	}

}
