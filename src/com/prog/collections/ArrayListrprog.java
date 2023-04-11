package com.prog.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListrprog {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add("Ram");
		ar.add("Rakesh");

		System.out.println(ar.size());

		System.out.println(ar.get(0));

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		Employee e1 = new Employee(101, "Ramesh");
		Employee e2 = new Employee(101, "Ramesh");

		// creating a list

		ArrayList<Employee> ar1 = new ArrayList<Employee>();
		ar1.add(e1);
		ar1.add(e2);

		// Iterator using traversee th elements

		Iterator<Employee> it = ar1.iterator();

		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.id);
			System.out.println(emp.name);
		}

	}

}
