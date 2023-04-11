package com.prog.javaabs;

import com.prog.inte.Car;

public class ICICIbank extends Bank implements Car {

	@Override
	public void loan() {
		System.out.println("Loan");

	}

	public void funds() {
		System.out.println("FUnds");
	}

	@Override
	public void start() {
		System.out.println("Start");

	}

	@Override
	public void stop() {
		System.out.println("Stop");

	}

}
