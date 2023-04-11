package com.prog.javapoly;

public class Employee extends Person {
	float salary;

	public Employee(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;

	}

	void display() {
		System.out.println(id + " " + name + " " + salary + " " + collname);
	}

	public static void main(String[] args) {

		Employee obj = new Employee(10233343, "Ram", 1000000);
		obj.display();

	}

}
