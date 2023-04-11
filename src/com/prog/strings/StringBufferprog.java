package com.prog.strings;

public class StringBufferprog {

	public static void main(String[] args) {

		StringBuffer sb4 = new StringBuffer("Ram");
		sb4.append(" Vishwa");
		System.out.println(sb4);

		StringBuffer sb5 = new StringBuffer("Ram");
		sb5.insert(1, "Vishwa");
		System.out.println(sb5);

		StringBuffer sb6 = new StringBuffer("Automation");
		sb6.replace(1, 4, "Ram");
		System.out.println(sb6); // ARammation

		StringBuffer sb7 = new StringBuffer("Automation");
		sb7.delete(1, 4);
		System.out.println(sb7); 

		System.out.println("*******************");

		StringBuilder sb = new StringBuilder("Ram");
		sb.append(" Vishwa");
		System.out.println(sb);

		StringBuilder sb1 = new StringBuilder("Ram");
		sb1.insert(1, "Vishwa");
		System.out.println(sb1);

		StringBuilder sb2 = new StringBuilder("Automation");
		sb2.replace(1, 4, "Ram");
		System.out.println(sb2); // ARammation

		StringBuilder sb3 = new StringBuilder("Automation");
		sb3.delete(1, 4);
		System.out.println(sb3); // Amation

	}

}
