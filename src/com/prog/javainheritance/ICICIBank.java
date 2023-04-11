package com.prog.javainheritance;

public class ICICIBank extends MultilevelInheritance {

	public void ICICIbank() {
		System.out.println("ICICI bank");
	}

	public static void main(String[] args) {
		ICICIBank obj = new ICICIBank();
		obj.SBIbank();
		obj.ICICIbank();

	}

}
