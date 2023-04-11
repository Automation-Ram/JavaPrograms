package com.prog.oopsConcepts;

public class CopyCons {

	int id;

	public CopyCons(int i) {
		id = i;
	}

	public CopyCons(CopyCons c) {
		id = c.id;
	}

	void display() {
		System.out.println(id);
	}

	public static void main(String[] args) {
		CopyCons obj = new CopyCons(101);
		CopyCons obj2 = new CopyCons(obj);
		obj.display();
		obj2.display();

	}

}
