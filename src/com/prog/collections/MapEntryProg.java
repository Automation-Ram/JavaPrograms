package com.prog.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEntryProg {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<Integer, Employee>();

		Employee emp1 = new Employee(1, "Melboure");
		Employee emp2 = new Employee(1, "Sydney");

		map.put(1, emp1);
		map.put(2, emp2);

		for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
			int e = entry.getKey();
			Employee emp3 = entry.getValue();
		}

	}

}
