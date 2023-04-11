package com.prog.inte;

public class HyundaiCar implements Car {

	@Override
	public void start() {
		System.out.println("Start");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop");
		
	}
	
	public void theftSafetty()

	{
		System.out.println("Theftsafety");
	}
}
