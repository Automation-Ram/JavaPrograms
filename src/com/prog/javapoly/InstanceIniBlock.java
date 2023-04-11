package com.prog.javapoly;

public class InstanceIniBlock {

	int speed;

	public InstanceIniBlock() {
		System.out.println(speed);
	}

	{
		speed = 150;
	}

	public static void main(String[] args) {
		InstanceIniBlock obj = new InstanceIniBlock();

	}

}
