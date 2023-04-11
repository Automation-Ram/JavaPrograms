package com.prog.inte;

public class TestCar {

	public static void main(String[] args) {
		HyundaiCar obj = new HyundaiCar();
		obj.start();
		obj.stop();
		obj.theftSafetty();

		Car c = new HyundaiCar();
		c.start();
		c.stop();

	}

}
