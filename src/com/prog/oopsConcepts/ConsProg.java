package com.prog.oopsConcepts;

public class ConsProg {

	int id;
	String name;

	public ConsProg(int i) {
		id = i;
	}

	public ConsProg(int i, String n) {
		id = i;
		name=n;
	}

	void display() {
		System.out.println(id + " " + name);

	}

	public static void main(String[] args) {
		ConsProg obj = new ConsProg(101);
		ConsProg obj1 = new ConsProg(102, "Ram");
		obj.display();
		obj1.display();

	}

}
