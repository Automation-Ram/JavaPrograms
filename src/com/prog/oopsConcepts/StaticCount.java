package com.prog.oopsConcepts;

public class StaticCount {

	static int num = 20;

	public StaticCount() {
		num++;
		System.out.println(num);
	}

	public static void main(String[] args) {
		StaticCount obj = new StaticCount();
		StaticCount obj1 = new StaticCount();
		StaticCount obj2 = new StaticCount();
		StaticCount obj3 = new StaticCount();
		StaticCount obj4 = new StaticCount();

	}

}
