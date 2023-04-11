package com.prog.exceptionhandling;

import java.io.IOException;

public class ThrowsProg {

	public void method1() throws IOException {
		throw new IOException("Device Error");
	}

	public void method2() throws IOException {
		method1();
	}

	public void method3() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) {
		ThrowsProg obj = new ThrowsProg();
		obj.method3();
		System.out.println("normal flow");

	}

}
