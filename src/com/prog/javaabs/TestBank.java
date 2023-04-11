package com.prog.javaabs;

public class TestBank {

	public static void main(String[] args) {
		ICICIbank obj = new ICICIbank(); //static polymor
		obj.credit();
		obj.debit();
		obj.loan();
		obj.funds();
		obj.start();
		obj.stop();

		Bank b = new ICICIbank(); // Dynamic poly
		b.credit();
		b.loan();
		b.debit();

	}

}
