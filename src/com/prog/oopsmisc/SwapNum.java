package com.prog.oopsmisc;

public class SwapNum {
	int a;
	int b;

	public static void main(String[] args) {
		SwapNum obj = new SwapNum();
		obj.a = 100;
		obj.b = 200;
		obj.swap(obj);
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

	public static void swap(SwapNum s) {
		int temp;
		temp = s.a;
		s.a = s.b;
		s.b = temp;
	}

}
